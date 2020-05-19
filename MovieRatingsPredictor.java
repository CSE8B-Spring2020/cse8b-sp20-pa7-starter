///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:              (program's title)
// Files:              (list of source files)
// Quarter:            (course) Spring 2020
//
// Author:             (your name)
// Email:              (your email address)
// Instructor's Name:  (name of your instructor)
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
//                   CHECK ASSIGNMENT PAGE TO see IF PAIR-PROGRAMMING IS
//                   ALLOWED
//                   If pair programming is allowed:
//                   1. Read PAIR-PROGRAMMING policy (in CSE 8B syllabus)
//                   2. choose a partner wisely
//                   3. complete this section for each program file.
//
// Pair Partner:        (name of your pair programming partner)
// Email:               (email address of your programming partner)
// Instructors's Name:  (name of your partner's instructor)
// Lab Section:         (your partner's lab section number)
//
//////////////////// STUDENTS WHO GET HELP FROM OTHER THAN THEIR PARTNER //////
//                   must fully acknowledge and credit those sources of help.
//                   Instructors and TAs do not have to be credited here,
//                   but roommates, relatives, strangers, etc do.
//
// Persons:          Identify persons by name, relationship to you, and email.
//                   Describe in detail the the ideas and help they provided.
//
// Online sources:   avoid web searches to solve your problems, but if you do
//                   search, be sure to include Web URLs and description of
//                   of any information you find.
//////////////////////////// 80 columns wide //////////////////////////////////
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * This class represents a movie rating predictor.
 *
 * Bugs: (a list of bugs and other problems)
 *
 * @author (your name)
 */
public class MovieRatingsPredictor {

    HashMap<String, Integer[]> wordValue;
    HashSet<String> stopWords;

    /**
     * No-Args Constructor for a MovieRatingsPredictor
     */
    public MovieRatingsPredictor() {
        //TODO method to implement
    }

    /**
     * Obtains the unique stop words from stopWordsFile and adds it to the set
     *
     * @param stopWordsFile A file name that contains the stop words
     * @return The number of unique stop words added to the set
     * @throws FileNotFoundException
     */
    public int fillStopWords(String stopWordsFile)
            throws FileNotFoundException {

        //TODO method to implement
        return 0;
    }

    /**
     * Reads the reviews in reviewsFile and stores them into an
     * ArrayList<ArrayList <String>>
     *
     * @param reviewsFile The file name that contains the reviews
     * @return ArrayList representation of the reviews
     * @throws FileNotFoundException
     */
    public ArrayList<ArrayList<String>> readReviewsFromFile(
            String reviewsFile) throws FileNotFoundException {

        //TODO method to implement
        return null;
    }

    /**
     * Removes the stop words from the ArrayList of reviews.
     *
     * @param rawData the ArrayList representation of reviews
     * @return ArrayList representation of reviews with stop words removed
     */
    public ArrayList<ArrayList<String>> removeStopWords(
            ArrayList<ArrayList<String>> rawData) {

        //TODO method to implement
        return null;
    }

    /**
     * Populates the wordValue HashMap with key String and Integer[] with
     * the format [totalRating, count].
     *
     * @param cleanReviewRatings ArrayList representation of reviews
     * @return The number of words (with value) in the wordValue HashMap
     */
    public int updateHashMap(ArrayList<ArrayList<String>> cleanReviewRatings) {
        //TODO method to implement
        return 0;
    }

    /**
     * Rates each review and adds the rating at the beginning of the ArrayList
     *
     * @param cleanReviews ArrayList representation of reviews
     * @return ArrayList representation of reviews with ratings
     */
    public ArrayList<ArrayList<String>> rateReviews(
            ArrayList<ArrayList<String>> cleanReviews) {

        //TODO method to implement
        return null;
    }

    /**
     * Writes reviews to a file
     *
     * @param cleanReviewsWithRatings The ArrayList representation of reviews
     * @param outputFile The file to write to
     * @return The number of reviews with ratings written to the file
     * @throws FileNotFoundException
     */
    public int writeReviewsToFile(
            ArrayList<ArrayList<String>> cleanReviewsWithRatings,
            String outputFile) throws FileNotFoundException {

        //TODO method to implement
        return 0;
    }
}
