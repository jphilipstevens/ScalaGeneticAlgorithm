package com.jono.genetic

import com.jono.genetic.selection.SelectionMechanism

/**
 * This is a Genetic Algorithm. It can run per iteration and return to the caller or run until it solves to problem
 */
class Algorithm(initialPopulation: List[Subject]) {

  // a probability used in crossover
  var crossoverPob: Double

  // selection algorithm used to do crossovers
  var selectionMechanism: SelectionMechanism

  def getGeneration(population: List[Subject]): List[Subject] = {

    return null
  }
}