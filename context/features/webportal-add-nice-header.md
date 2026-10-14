# Add feature add a nice centered header on the welkom page.

## Overview

Add a nice header H1 style centered on the welkom page above the button list.
At the top of the page.

## Solution

At the top of the page add H1 header with text "Welcome to WebPortal".
Ensure this text is centered on his first line.
Below the button list must be displayed : Home, message field, Hello button and GetDate button dame order as used in current implementation.

## Use as reference 

Use as reference of what the WebPortal is all about @/context/features/webportal-add-new-vaadin-portal.md

## Changes Required

- Add H1 in the .\SpringWeb\WebPortal\src\main\java\com\example\webportalMainView.java portal landingspage.
- Do not change any of the other components , just shift them down.