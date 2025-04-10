# 🧠 Systems & Algorithms Cheatsheet

A curated collection of advanced systems and algorithmic concepts with concise explanations and usage insights.

---

## 🔁 Streaming & Sketching

### **Frugal Streaming**
A memory-efficient technique to estimate quantiles (like the median) using just 1–2 variables. For example, the 1-variable median estimator adjusts up or down based on stream input.

### **Count-Min Sketch**
A probabilistic data structure is used to count the frequencies of elements in data streams using sub-linear space. It uses multiple hash functions and a 2D array to approximate counts.

### **HyperLogLog**
Used for cardinality estimation (i.e., counting distinct elements). It’s based on the position of the leftmost 1-bit in hashed values and provides near-accurate results with very little memory.

### **AMS Algorithm (Alon-Matias-Szegedy)**
Estimates frequency moments (like F2 = sum of squares of frequencies) in streaming data using randomized algorithms and minimal space.

### **Lossy Counting**
Keeps track of frequent items in data streams with an error threshold. It maintains counters and prunes less frequent items over fixed-size buckets.

---

## 🌍 Spatial & Indexing

### **Geohash / S2 Geometry**
- **Geohash**: Encodes lat/lng into base32 strings. The same prefixes mean proximity.
- **S2 Geometry**: Divides the sphere into hierarchical cells. Used by Google Maps and Uber for spatial indexing.

### **Quadtree / R-tree**
- **Quadtree**: Divides 2D space into quadrants. Efficient for point-region queries.
- **R-tree**: Tree-based index for rectangles/polygons. Used in GIS databases for fast spatial queries.

### **Ray Casting**
A technique used to determine if a point lies inside a polygon. It works by counting edge crossings.

### **Reverse Index**
Maps from content (e.g., words) to documents that contain them. It’s the core of full-text search engines.

---

## 📚 Data Structures for Efficiency

### **Bloom Filters**
Space-efficient probabilistic structure to test membership. Has false positives but no false negatives.

### **Trie**
A tree-like data structure to store strings, character by character. Great for prefix queries.

### **B-Tree**
Balanced search tree widely used in databases and filesystems for fast insertion, deletion, and range queries.

### **Fenwick Tree (Binary Indexed Tree)**
Used for cumulative frequency tables and range sum queries in logarithmic time.

### **Consistent Hashing**
Distributes keys uniformly across nodes in a dynamic system. Crucial in distributed systems for sharding and caching.

---

## 🧠 Caching & Scheduling

### **LRU and Other Eviction Policies**
- **LRU**: Evicts least recently used item.
- **LFU**: Evicts least frequently used.
- **Random**, **FIFO**, and custom policies used in various caches.

### **Hierarchical Timing Wheels**
Efficient data structure for managing large numbers of time-based events (e.g., timers). Common in OS and networking.

---

## 🚦 Rate Limiting & Sync

### **Leaky Bucket / Token Bucket**
- **Leaky Bucket**: Enforces constant rate by leaking tokens at a fixed rate.
- **Token Bucket**: Allows bursts; tokens are refilled periodically.

### **Rsync Algorithm**
A delta encoding algorithm that computes differences between files efficiently using rolling checksums and hashes.

---

## ✍️ Real-time Collaboration / Editing

### **Operational Transformation**
Used in collaborative editing tools (like Google Docs). Ensures consistency across distributed users by transforming conflicting operations.

