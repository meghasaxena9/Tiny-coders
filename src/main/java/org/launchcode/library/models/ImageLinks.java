package org.launchcode.library.models;

public class ImageLinks {

        private String smallThumbnail;
        private String thumbnail;

        public ImageLinks() {
        }

        public ImageLinks(String smallThumbnail, String thumbnail) {
            this.smallThumbnail = smallThumbnail;
            this.thumbnail = thumbnail;
        }

        public String getSmallThumbnail() {
            return smallThumbnail;
        }

        public String getThumbnail() {
            return thumbnail;
        }

        public void setThumbnail(String thumbnail) {
            this.thumbnail = thumbnail;
        }

        public void setSmallThumbnail(String smallThumbnail) {
            this.smallThumbnail = smallThumbnail;
        }
    }

