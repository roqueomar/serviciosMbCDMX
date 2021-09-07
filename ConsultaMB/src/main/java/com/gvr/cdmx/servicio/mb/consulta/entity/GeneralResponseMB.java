package com.gvr.cdmx.servicio.mb.consulta.entity;

public class GeneralResponseMB {
	private String help;
	private String success;
	private Result result;

	public String getHelp() {
		return help;
	}

	public void setHelp(String help) {
		this.help = help;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public class Result {
		private String includeTotal;
		private String limit;
		private String recordsFormat;
		private String resourceId;
		private String totalEstimationThreshold;
		private MetroBus[] records;
		private Fields[] fields;
		private Links _links;
		private String total;
		private String totalWasEstimated;

		public MetroBus[] getRecords() {
			return records;
		}

		public void setRecords(MetroBus[] records) {
			this.records = records;
		}

		public Fields[] getFields() {
			return fields;
		}

		public void setFields(Fields[] fields) {
			this.fields = fields;
		}

		public String getIncludeTotal() {
			return includeTotal;
		}

		public void setIncludeTotal(String includeTotal) {
			this.includeTotal = includeTotal;
		}

		public String getLimit() {
			return limit;
		}

		public void setLimit(String limit) {
			this.limit = limit;
		}

		public String getRecordsFormat() {
			return recordsFormat;
		}

		public void setRecordsFormat(String recordsFormat) {
			this.recordsFormat = recordsFormat;
		}

		public String getResourceId() {
			return resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getTotalEstimationThreshold() {
			return totalEstimationThreshold;
		}

		public void setTotalEstimationThreshold(String totalEstimationThreshold) {
			this.totalEstimationThreshold = totalEstimationThreshold;
		}

		public Links get_links() {
			return _links;
		}

		public void set_links(Links _links) {
			this._links = _links;
		}

		public String getTotal() {
			return total;
		}

		public void setTotal(String total) {
			this.total = total;
		}

		public String getTotalWasEstimated() {
			return totalWasEstimated;
		}

		public void setTotalWasEstimated(String totalWasEstimated) {
			this.totalWasEstimated = totalWasEstimated;
		}
	}

}

class Fields {
	private String id;
	private String type;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}

class Links {
	private String start;
	private String next;

	public String getStart() {
		return start;
	}

	public void setStart(String start) {
		this.start = start;
	}

	public String getNext() {
		return next;
	}

	public void setNext(String next) {
		this.next = next;
	}
}