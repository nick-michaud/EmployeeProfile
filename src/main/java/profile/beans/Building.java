package profile.beans;

import jakarta.persistence.Embeddable;

@Embeddable
public class Building {
		private String deskNum;
		private String city;
		private String state;
		
		public Building() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Building(String deskNum, String city, String state) {
			super();
			this.deskNum = deskNum;
			this.city = city;
			this.state = state;
		}

		public String getDeskNum() {
			return deskNum;
		}

		public void setDeskNum(String deskNum) {
			this.deskNum = deskNum;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		@Override
		public String toString() {
			return "Building [deskNum=" + deskNum + ", city=" + city + ", state=" + state + "]";
		}
		
		
}
