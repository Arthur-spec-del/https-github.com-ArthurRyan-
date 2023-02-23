# -*- coding: utf-8 -*-
"""voting.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/12SwuqVHcBfPYNbCbmVXxrIPHhny0tmqO
"""

# Voting
#from - https://machinelearningmastery.com/voting-ensembles-with-python/

# compare voting ensemble to each standalone models for regression
from numpy import mean
from numpy import std
from sklearn.datasets import make_regression
from sklearn.model_selection import cross_val_score
from sklearn.model_selection import RepeatedKFold
from sklearn.tree import DecisionTreeRegressor
from sklearn.ensemble import VotingRegressor
from matplotlib import pyplot
 
# get the dataset
# def get_dataset():
#  X, y = make_regression(n_samples=1000, n_features=20, n_informative=15, noise=0.1, random_state=1)
#  return X, y

import numpy as np
import pandas as pd
from model.base import BaseModel
from sklearn.metrics import classification_report, confusion_matrix
from numpy import *
import random
num_folds = 0
seed =0
# Data
np.random.seed(seed)
random.seed(seed)
pd.set_option('display.max_rows', 500)
pd.set_option('display.max_columns', 500)
pd.set_option('display.width', 1000)
pd.set_option('display.max_colwidth', 200)


class voting(BaseModel):
    def __init__(self,
                 model_name: str,
                 embeddings: np.ndarray,
                 y: np.ndarray) -> None:
        super(voting, self).__init__()
        self.model_name = model_name
        self.embeddings = embeddings
        self.y = y
        #self.mdl = RandomForest(n_estimators=1000, random_state=seed, class_weight='balanced_subsample')
        #self.mdl = SGDClassifier(loss="hinge", penalty="l2", max_iter=5)
        
        #self.mdl = VotingRegressor()
        self.mdl = DecisionTreeRegressor()

        #self.mdl(max_iter=5)
        self.predictions = None
        self.data_transform()

    def train(self, data) -> None:
        self.mdl = self.mdl.fit(data.X_train, data.y_train)


    # get a voting ensemble of models
    def get_voting():
    # define the base models
    models = list()
    models.append(('cart1', DecisionTreeRegressor(max_depth=1)))
    models.append(('cart2', DecisionTreeRegressor(max_depth=2)))
    models.append(('cart3', DecisionTreeRegressor(max_depth=3)))
    models.append(('cart4', DecisionTreeRegressor(max_depth=4)))
    models.append(('cart5', DecisionTreeRegressor(max_depth=5)))
    # define the voting ensemble
    ensemble = VotingRegressor(estimators=models)
    return ensemble
    
    # get a list of models to evaluate
    def get_models():
    models = dict()
    models['cart1'] = DecisionTreeRegressor(max_depth=1)
    models['cart2'] = DecisionTreeRegressor(max_depth=2)
    models['cart3'] = DecisionTreeRegressor(max_depth=3)
    models['cart4'] = DecisionTreeRegressor(max_depth=4)
    models['cart5'] = DecisionTreeRegressor(max_depth=5)
    models['voting'] = get_voting()
    return models
 
    # evaluate a give model using cross-validation
    def evaluate_model(model, X, y):
    cv = RepeatedKFold(n_splits=10, n_repeats=3, random_state=1)
    scores = cross_val_score(model, X, y, scoring='neg_mean_absolute_error', cv=cv, n_jobs=-1, error_score='raise')
    return scores
 
    # # define dataset
    # X, y = get_dataset()
    # get the models to evaluate
    models = get_models()
    # evaluate the models and store results
    results, names = list(), list()
    for name, model in models.items():
      scores = evaluate_model(model, X, y)
      results.append(scores)
      names.append(name)
      print('>%s %.3f (%.3f)' % (name, mean(scores), std(scores)))
      # plot model performance for comparison
      pyplot.boxplot(results, labels=names, showmeans=True)
      pyplot.show()

    def predict(self, X_test: pd.Series):
        predictions = self.mdl.predict(X_test)
        self.predictions = predictions
        #self.score(X, y)
        self.coef_
        self.intercept_
        #self.decision_function([[2., 2.]])

    def print_results(self, data):
        print(classification_report(data.y_test, self.predictions))

    def data_transform(self) -> None:
        ...