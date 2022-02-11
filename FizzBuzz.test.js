import { render } from "@testing-library/react"
import FizzBuzz from "./FizzBuzz"
import React from 'react'
import { screen} from '@testing-library/dom'
import '@testing-library/jest-dom/extend-expect'

test('tester mon composant FizzBuzz', function(){
    render(<FizzBuzz testgama= "gama" />)
    const testgama = screen.getByText("gama")
    expect(testgama).toBeInTheDocument()
})
