Suppose the following [0~99] represents 100 positions of a warehouse, and the dotted line represents the aisle. In the same aisle, the upper and lower positions can be regarded as the same sequence (eg: 0 & 10 , 4 & 14 …). Now given a array of positions, it is required to start from position 0 and with “Z-shaped” picking sequence.

If the first three aisle all need to be picked, then go from 0 to 9, then enter from 29, go to 20, then enter from 40, go to 49.
If the second aisle does not need picking, then go from 0 to 9, then enter from 49, and go to 40. it do not need to enter the second aisle from 29 to go to 20.
   0  1  2  3  4  5  6  7  8  9
  >>---------------------------
  10 11 12 13 14 15 16 17 18 19
  20 21 22 23 24 25 26 27 28 29
  -----------------------------
  30 31 32 33 34 35 36 37 38 39
  40 41 42 43 44 45 46 47 48 49
  -----------------------------
  50 51 52 53 54 55 56 57 58 59
  60 61 62 63 64 65 66 67 68 69
  -----------------------------
  70 71 72 73 74 75 76 77 78 79
  80 81 82 83 84 85 86 87 88 89
  -----------------------------
  90 91 92 93 94 95 96 97 98 99
Example 1: Given the position [56,13,26,35,32,42,72], the final sorting result is: [13, 26, 35, 32, 42, 56, 72] . The path is shown in the following figure:

   0  1  2  3  4  5  6  7  8  9
  >>--------①------------------
  10 11 12 13 14 15 16 17 18 19
  20 21 22 23 24 25 26 27 28 29
  -------④--------③--②-------<<
  30 31 32 33 34 35 36 37 38 39
  40 41 42 43 44 45 46 47 48 49
  >>-----⑤-----------⑥---------
  50 51 52 53 54 55 56 57 58 59
  60 61 62 63 64 65 66 67 68 69
  ----⑦----------------------<<
  70 71 72 73 74 75 76 77 78 79
  80 81 82 83 84 85 86 87 88 89
  -----------------------------
  90 91 92 93 94 95 96 97 98 99
Example 2: Given a position [18, 65, 77, 79, 5, 41, 57, 72], the final sorting result is:
 [5, 18, 57, 41, 72, 65, 77, 79],
 5 18 57 41 72 65 77 79
  the path is as shown in the figure below Show (no need to go to the second aisle, go straight to the third aisle after exiting from the right side of the first aisle):

   0  1  2  3  4  5  6  7  8  9
  >>--------------①--------②---
  10 11 12 13 14 15 16 17 18 19
  20 21 22 23 24 25 26 27 28 29
  -----------------------------
  30 31 32 33 34 35 36 37 38 39
  40 41 42 43 44 45 46 47 48 49
  ----④-----------------③----<<
  50 51 52 53 54 55 56 57 58 59
  60 61 62 63 64 65 66 67 68 69
  >>-----⑤--------⑥-----⑦-----⑧
  70 71 72 73 74 75 76 77 78 79
  80 81 82 83 84 85 86 87 88 89
  -----------------------------
  90 91 92 93 94 95 96 97 98 99
Please write an algorithm to achieve the sorting of the above two example 1 and example 2.