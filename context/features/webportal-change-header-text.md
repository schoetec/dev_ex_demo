# Change the header text.

## Overview

In the WebPortal change the header text.

## Solution

At the top of the landingspage change the H1 header text.
The landingspage hesder text is defined in hte static variable LANDINGSPAGE_HEADER_TEXT

## Use as reference 

Use as reference of what the WebPortal is all about @/context/features/webportal-add-new-vaadin-portal.md

## Changes Required

- Change the text of the H1 in the \SpringWeb\WebPortal\src\main\java\com\example\webportal\MainView.java portal landingspage to "Welcome to this DPG WebPortal". The header text can be found in the static variable LANDINGSPAGE_HEADER_TEXT. Update this variable content.
- Do not change any of the other components.