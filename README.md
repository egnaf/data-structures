# data-structures
The purpose of this repository is to give an idea of data structures in Java Collections Framework.

- **[Collection Framework]()**
  - **[Lists]()**
    - [Vector]()
    - [Stack]()
    - [ArrayList]()
    - [LinkedList]()
  - **[Set]()**
    - [HashSet]()
    - [TreeSet]()
    - [LinkedHashSet]()
  - **[Queues]()**
    - [ArrayDeque]()
    - [PriorityQueue]()
  - **[Maps]()**
    - [HashTable]()
    - [HashMap]()
    - [TreeMap]()
    - [LinkedHashMap]()
  - **[Synchronized collections]()**
- **[Apache Commons]()**
- **[Guava]()**

## Collection Framework
### Lists
#### Vector
| **Action** | **Worst** | **Best** |
--- | --- | ---
| access | O(1) | |
| search | O(n) | |
| insert | O(n) | |
| delete | O(1) | |

#### Stack
| **Action** | **Worst** | **Best** |
--- | --- | ---
| access | O(n) | |
| search | O(n) | |
| insert | O(1) | |
| delete | O(n) | |

#### ArrayList
**Description**<br>
A data structure that stores items in an array with dynamic capacity increase.

Type: array<br>
Default capacity: 10<br>
Increase: oldCapacity + (oldCapacity >> 2)

| **Action** | **Worst** | **Best** |
--- | --- | ---
| access | O(1) | O(1)       
| search | O(n) | O(1) 
| insert | O(n) | O(1) 
| delete | O(n) | O(1) 

#### LinkedList
| **Action** | **Worst** | **Best** |
--- | --- | ---
| access | O(n) | |
| search | O(n) | |
| insert | O(1) | |
| delete | O(1) | |

### Set
#### HashSet
#### TreeSet
#### LinkedHashSet
### Queues
#### ArrayDeque
#### PriorityQueue
### Maps
#### HashTable
#### HashMap
#### TreeMap
#### LinkedHashMap
### Synchronized collections
## Apache Commons
## Guava

## Contribute
For any problems, comments, or feedback please create an issue [here](https://github.com/egnaf/data-structures/issues).
<br>

## License
This software is released under the [MIT](http://mitlicense.org) license.
