# -*- coding: utf-8 -*-
"""sgd.ipynb

Automatically generated by Colaboratory.

Original file is located at
    https://colab.research.google.com/drive/14RECJ_6rJSuJf7Uxg7KOQf_NxfbLJUQP
"""

# SGD
#from - https://scikit-learn.org/stable/modules/sgd.html

import numpy as np
import pandas as pd
from model.base import BaseModel

from sklearn.linear_model import SGDClassifier

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


class SGD(BaseModel):
    def __init__(self,
                 model_name: str,
                 embeddings: np.ndarray,
                 y: np.ndarray) -> None:
        super(SGD, self).__init__()
        self.model_name = model_name
        self.embeddings = embeddings
        self.y = y
        #self.mdl = RandomForest(n_estimators=1000, random_state=seed, class_weight='balanced_subsample')
        self.mdl = SGDClassifier(loss="hinge", penalty="l2", max_iter=5)
        #SGDClassifier(max_iter=5)
        self.mdl(max_iter=5)
        self.predictions = None
        self.data_transform()

    def train(self, data) -> None:
        self.mdl = self.mdl.fit(data.X_train, data.y_train)

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