(defn funclineal [m b x]
  (+(* m x) b)
  )

(funclineal 4 6 5)



(defn pendiente [x1 y1 x2 y2]
(cond 
  (== (/(- y2 y1)(- x2 x1)) 0) "Constante"
  (> (/(- y2 y1)(- x2 x1)) 0) "Creciente"
  (< (/(- y2 y1)(- x2 x1)) 0) "Decreceinte"
)
)

( pendiente 0 3 1 3)


(defn pendientem [x1 y1 x2 y2]
  (/(- y2 y1)(- x2 x1))  
)

(pendientem 0 3 1 3)



(defn funcion-punto-recta [m b x y]
(cond
  (= (funclineal m b x) y) "El punto esta en la recta"
  :else "El punto NO esta en la recta")
)

(funcion-punto-recta 6 7 9 2)

(defn funclinealb [m x y]
  (- y (* m x))
  )

(funclinealb 4 5 26)

(defn funcion-m-b [x1 y1 x2 y2]
  def (pendientem 0 3 1 3)
  )


(funcion-m-b 0 3 1 3)













