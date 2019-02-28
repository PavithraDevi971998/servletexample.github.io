package org.cts;


	public class Emp {
		private int id;
		private String name;
		private String address;
		public Emp(int id, String name, String address) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
		}
		public int getid() {
			return id;
		}
		public void setid(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
	}


