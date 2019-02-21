### [Challenge Name: Counting Valleys](/challenges/counting-valleys)

Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography. During his last hike he took exactly $n$ steps. For every step he took, he noted if it was an _uphill_, $U$, or a _downhill_, $D$ step. Gary's hikes start and end at sea level and each step up or down represents a $1$ unit change in altitude. We define the following terms:

- A _mountain_ is a sequence of consecutive steps _above_ sea level, starting with a step _up_ from sea level and ending with a step _down_ to sea level.
- A _valley_ is a sequence of consecutive steps _below_ sea level, starting with a step _down_ from sea level and ending with a step _up_ to sea level.

Given Gary's sequence of _up_ and _down_ steps during his last hike, find and print the number of _valleys_ he walked through.

For example, if Gary's path is $s=[DDUUUUDD]$, he first enters a valley $2$ units deep. Then he climbs out an up onto a mountain $2$ units high. Finally, he returns to sea level and ends his hike.

**Function Description**

Complete the _countingValleys_ function in the editor below. It must return an integer that denotes the number of valleys Gary traversed.

countingValleys has the following parameter(s):

- _n_: the number of steps Gary takes
- _s_: a string describing his path
