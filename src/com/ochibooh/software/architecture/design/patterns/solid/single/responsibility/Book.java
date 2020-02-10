/*
 * Copyright (c) 2020
 *     Phelix Ochieng(Ochibooh)
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ochibooh.software.architecture.design.patterns.solid.single.responsibility;

public class Book implements BookImp {

    private int numOfPages;
    private String authorName;

    public Book(int numOfPages, String authorName) {
        this.numOfPages = numOfPages;
        this.authorName = authorName;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public void print() {
        System.out.println("Printing a book...");
    }

    @Override
    public void save() {
        System.out.println("Saving a book...");
    }

    @Override
    public String toString() {
        return "Book{" +
                "numOfPages=" + numOfPages +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
