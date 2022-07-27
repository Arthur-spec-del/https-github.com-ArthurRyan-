##### *** Project AI - Semester 2 - Logistics ***
##### Adapted from Chapter 7: Neural Networks and Support Vector Machines -------------------

# Step 1: - loading packages ---

#install.packages("dplyr")
#install.packages("tidyverse")
#install.packages("rio")

## Step 2: Exploring and preparing the data ----

library(rio) # must be run at the same time as 'import'
logistics_data_raw <- import("C:\\Users\\Arthur\\Documents\\NCI - HDAIML\\Semester 2\\Artificial Intelligence\\AI Project (due 26-4-2021)\\R code\\Project-AI - Mockaroo training data v1.4reduced.csv") # Project data file
# for examiner - local file location
# logistics_data_raw <- import("Project-AI - Mockaroo training data v1.4reduced.csv")


str(logistics_data_raw) # original

str(logistics_data_raw) # AR addition - displays structure of datatype


logistics_data_raw <-data.frame(logistics_data_raw)

logistics_data_prepared <- as.data.frame(sapply(logistics_data_raw,as.numeric))


str(logistics_data_prepared) # AR addition - displays structure of datatype

logistics_data_prepared[1:5, ]
str(logistics_data_prepared) # *** -> reading the full set of figures PRE normalisation <- *** => solution may be an error handler

summary(logistics_data_prepared$Total_Cost)
summary(logistics_data_prepared)

# custom normalization function
normalize <- function(x) { 
  # error handling 
  x <- x + 0.000001
  range_var = (max(x) - min(x))

  return((x - min(x)) / range_var)
}

# apply normalization to entire data frame
logistics_data_prepared[1:25000, ] # AR addition
str(logistics_data_prepared)

# *** -> reading the full set of figures PRE normalization <- *** => solution may be an error handler
logistics_data_norm <- as.data.frame(lapply(logistics_data_prepared, normalize)) 
# *** -> reading the full set of figures PRE normalization <- *** => solution may be an error handler

logistics_data_norm[1:25000, ] # AR addition

str(logistics_data_prepared)
str(logistics_data_norm)

# confirm that the range is now between zero and one
summary(logistics_data_norm$Total_Cost)


# compared to the original minimum and maximum
summary(logistics_data_prepared$Total_Cost)

# create training and test data
data_train <- logistics_data_norm[1:20000, ]
data_test <- logistics_data_norm[20001:25000, ]


## Step 3: Training a model on the data ----
## Step 3: Training a model on the data ----
## Step 3: Training a model on the data ----

# train the neuralnet model
library(neuralnet)

str(data_train) # AR addition

logistics_model <- neuralnet(Total_Cost ~ Ship_hire_cost_per_day_per_unit_capacity + Unused_Capacity, 
                              data_train, 
                              hidden = c(5), threshold = 0.01,
                              stepmax = 1e+05, rep = 1, startweights = NULL,
                              learningrate.limit = NULL, learningrate.factor = list(minus = 0.5, plus = 1.2), learningrate = NULL, 
                              lifesign = "none", lifesign.step = 1000, 
                              algorithm = "slr", 
                              err.fct = "sse",
                              act.fct = "logistic", 
                              linear.output = TRUE, exclude = NULL,
                              constant.weights = NULL, 
                              likelihood = FALSE) 


# visualize the network topology
plot(logistics_model)

## Step 4: *** Evaluating model performance *** ----
## Step 4: *** Evaluating model performance *** ----
## Step 4: *** Evaluating model performance *** ----

# obtain model results
model_results <- compute(logistics_model, data_test[1:48])
# obtain predicted strength values
predicted_logistics_cost <- model_results$net.result
# examine the correlation between predicted and actual values
cor(predicted_logistics_cost, data_test$Total_Cost)


## Step 5: Improving model performance ----
## Step 5: Improving model performance ----
## Step 5: Improving model performance ----

# a more complex neural network topology with 5 hidden neurons

## Step 5: Improving model performance ----

softplus <- function(x) {log(1 + exp(x))}

logistics_model2 <- neuralnet(Total_Cost ~ Ship_hire_cost_per_day_per_unit_capacity + Unused_Capacity, 
          data_test, # *** note this needs to say TEST ie 'data_test'  
          hidden = c(5), threshold = 0.01,
          stepmax = 1e+05, rep = 1, startweights = NULL,
          learningrate.limit = NULL, learningrate.factor = list(minus = 0.5, plus = 1.2), learningrate = NULL, 
          lifesign = "none", lifesign.step = 1000, 
          algorithm = "slr", 
          err.fct = "sse",
          act.fct = "logistic", 
          linear.output = TRUE, exclude = NULL,
          constant.weights = NULL, 
          likelihood = FALSE) 
          # a string containing the algorithm type to calculate the neural network. The following types are possible: 'backprop', 'rprop+', 'rprop-', 'sag', or 'slr'. 'backprop' refers to backpropagation, 'rprop+' and 'rprop-' refer to the resilient backpropagation with and without weight backtracking, while 'sag' and 'slr' induce the usage of the modified globally convergent algorithm (grprop). 
          # for activation function - additionally the strings, 'logistic' and 'tanh' are possible for the logistic function and tangent hyperbolicus.

# plot the network
plot(logistics_model2)

# evaluate the results as we did before
model_results2 <- compute(logistics_model2, data_test[1:48])
predicted_logistics_cost2 <- model_results2$net.result
cor(predicted_logistics_cost2, data_test$Total_Cost)

