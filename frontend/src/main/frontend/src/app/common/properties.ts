import {ActionReducer, Action, State} from '@ngrx/store';
import {Property} from "./property.model";

export const ADD_PROPERTY = 'Add a property';
export const REMOVE_PROPERTY = 'Remove a property';
export const UPDATE_PROPERTY = 'Update a property';

// https://www.pluralsight.com/guides/front-end-javascript/building-a-redux-application-with-angular-2-part-1
const initalState:State<Property> = [];

export const  propertiesReducer: ActionReducer<Property> = (state = initalState, action: Action) => {
  switch (action.type) {

    case ADD_PROPERTY:
      const property:Property = action.payload;
      return [ ...state, property ];

    // case REMOVE_PROPERTY:
    //   return state.filter(property => {
    //     return property.name !== action.payload.name;
    //   });

    default:
      return state;
  }
};
