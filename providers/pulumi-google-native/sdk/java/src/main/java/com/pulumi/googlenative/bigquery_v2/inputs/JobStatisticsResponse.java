// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.bigquery_v2.inputs.JobStatistics2Response;
import com.pulumi.googlenative.bigquery_v2.inputs.JobStatistics3Response;
import com.pulumi.googlenative.bigquery_v2.inputs.JobStatistics4Response;
import com.pulumi.googlenative.bigquery_v2.inputs.JobStatisticsReservationUsageItemResponse;
import com.pulumi.googlenative.bigquery_v2.inputs.RowLevelSecurityStatisticsResponse;
import com.pulumi.googlenative.bigquery_v2.inputs.ScriptStatisticsResponse;
import com.pulumi.googlenative.bigquery_v2.inputs.SessionInfoResponse;
import com.pulumi.googlenative.bigquery_v2.inputs.TransactionInfoResponse;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class JobStatisticsResponse extends com.pulumi.resources.InvokeArgs {

    public static final JobStatisticsResponse Empty = new JobStatisticsResponse();

    /**
     * [TrustedTester] [Output-only] Job progress (0.0 -> 1.0) for LOAD and EXTRACT jobs.
     * 
     */
    @Import(name="completionRatio", required=true)
      private final Double completionRatio;

    public Double completionRatio() {
        return this.completionRatio;
    }

    /**
     * Creation time of this job, in milliseconds since the epoch. This field will be present on all jobs.
     * 
     */
    @Import(name="creationTime", required=true)
      private final String creationTime;

    public String creationTime() {
        return this.creationTime;
    }

    /**
     * End time of this job, in milliseconds since the epoch. This field will be present whenever a job is in the DONE state.
     * 
     */
    @Import(name="endTime", required=true)
      private final String endTime;

    public String endTime() {
        return this.endTime;
    }

    /**
     * Statistics for an extract job.
     * 
     */
    @Import(name="extract", required=true)
      private final JobStatistics4Response extract;

    public JobStatistics4Response extract() {
        return this.extract;
    }

    /**
     * Statistics for a load job.
     * 
     */
    @Import(name="load", required=true)
      private final JobStatistics3Response load;

    public JobStatistics3Response load() {
        return this.load;
    }

    /**
     * Number of child jobs executed.
     * 
     */
    @Import(name="numChildJobs", required=true)
      private final String numChildJobs;

    public String numChildJobs() {
        return this.numChildJobs;
    }

    /**
     * If this is a child job, the id of the parent.
     * 
     */
    @Import(name="parentJobId", required=true)
      private final String parentJobId;

    public String parentJobId() {
        return this.parentJobId;
    }

    /**
     * Statistics for a query job.
     * 
     */
    @Import(name="query", required=true)
      private final JobStatistics2Response query;

    public JobStatistics2Response query() {
        return this.query;
    }

    /**
     * Quotas which delayed this job's start time.
     * 
     */
    @Import(name="quotaDeferments", required=true)
      private final List<String> quotaDeferments;

    public List<String> quotaDeferments() {
        return this.quotaDeferments;
    }

    /**
     * Name of the primary reservation assigned to this job. Note that this could be different than reservations reported in the reservation usage field if parent reservations were used to execute this job.
     * 
     */
    @Import(name="reservationId", required=true)
      private final String reservationId;

    public String reservationId() {
        return this.reservationId;
    }

    /**
     * Job resource usage breakdown by reservation.
     * 
     */
    @Import(name="reservationUsage", required=true)
      private final List<JobStatisticsReservationUsageItemResponse> reservationUsage;

    public List<JobStatisticsReservationUsageItemResponse> reservationUsage() {
        return this.reservationUsage;
    }

    /**
     * [Preview] Statistics for row-level security. Present only for query and extract jobs.
     * 
     */
    @Import(name="rowLevelSecurityStatistics", required=true)
      private final RowLevelSecurityStatisticsResponse rowLevelSecurityStatistics;

    public RowLevelSecurityStatisticsResponse rowLevelSecurityStatistics() {
        return this.rowLevelSecurityStatistics;
    }

    /**
     * Statistics for a child job of a script.
     * 
     */
    @Import(name="scriptStatistics", required=true)
      private final ScriptStatisticsResponse scriptStatistics;

    public ScriptStatisticsResponse scriptStatistics() {
        return this.scriptStatistics;
    }

    /**
     * [Preview] Information of the session if this job is part of one.
     * 
     */
    @Import(name="sessionInfo", required=true)
      private final SessionInfoResponse sessionInfo;

    public SessionInfoResponse sessionInfo() {
        return this.sessionInfo;
    }

    /**
     * Start time of this job, in milliseconds since the epoch. This field will be present when the job transitions from the PENDING state to either RUNNING or DONE.
     * 
     */
    @Import(name="startTime", required=true)
      private final String startTime;

    public String startTime() {
        return this.startTime;
    }

    /**
     * Slot-milliseconds for the job.
     * 
     */
    @Import(name="totalSlotMs", required=true)
      private final String totalSlotMs;

    public String totalSlotMs() {
        return this.totalSlotMs;
    }

    /**
     * [Alpha] Information of the multi-statement transaction if this job is part of one.
     * 
     */
    @Import(name="transactionInfo", required=true)
      private final TransactionInfoResponse transactionInfo;

    public TransactionInfoResponse transactionInfo() {
        return this.transactionInfo;
    }

    public JobStatisticsResponse(
        Double completionRatio,
        String creationTime,
        String endTime,
        JobStatistics4Response extract,
        JobStatistics3Response load,
        String numChildJobs,
        String parentJobId,
        JobStatistics2Response query,
        List<String> quotaDeferments,
        String reservationId,
        List<JobStatisticsReservationUsageItemResponse> reservationUsage,
        RowLevelSecurityStatisticsResponse rowLevelSecurityStatistics,
        ScriptStatisticsResponse scriptStatistics,
        SessionInfoResponse sessionInfo,
        String startTime,
        String totalSlotMs,
        TransactionInfoResponse transactionInfo) {
        this.completionRatio = Objects.requireNonNull(completionRatio, "expected parameter 'completionRatio' to be non-null");
        this.creationTime = Objects.requireNonNull(creationTime, "expected parameter 'creationTime' to be non-null");
        this.endTime = Objects.requireNonNull(endTime, "expected parameter 'endTime' to be non-null");
        this.extract = Objects.requireNonNull(extract, "expected parameter 'extract' to be non-null");
        this.load = Objects.requireNonNull(load, "expected parameter 'load' to be non-null");
        this.numChildJobs = Objects.requireNonNull(numChildJobs, "expected parameter 'numChildJobs' to be non-null");
        this.parentJobId = Objects.requireNonNull(parentJobId, "expected parameter 'parentJobId' to be non-null");
        this.query = Objects.requireNonNull(query, "expected parameter 'query' to be non-null");
        this.quotaDeferments = Objects.requireNonNull(quotaDeferments, "expected parameter 'quotaDeferments' to be non-null");
        this.reservationId = Objects.requireNonNull(reservationId, "expected parameter 'reservationId' to be non-null");
        this.reservationUsage = Objects.requireNonNull(reservationUsage, "expected parameter 'reservationUsage' to be non-null");
        this.rowLevelSecurityStatistics = Objects.requireNonNull(rowLevelSecurityStatistics, "expected parameter 'rowLevelSecurityStatistics' to be non-null");
        this.scriptStatistics = Objects.requireNonNull(scriptStatistics, "expected parameter 'scriptStatistics' to be non-null");
        this.sessionInfo = Objects.requireNonNull(sessionInfo, "expected parameter 'sessionInfo' to be non-null");
        this.startTime = Objects.requireNonNull(startTime, "expected parameter 'startTime' to be non-null");
        this.totalSlotMs = Objects.requireNonNull(totalSlotMs, "expected parameter 'totalSlotMs' to be non-null");
        this.transactionInfo = Objects.requireNonNull(transactionInfo, "expected parameter 'transactionInfo' to be non-null");
    }

    private JobStatisticsResponse() {
        this.completionRatio = null;
        this.creationTime = null;
        this.endTime = null;
        this.extract = null;
        this.load = null;
        this.numChildJobs = null;
        this.parentJobId = null;
        this.query = null;
        this.quotaDeferments = List.of();
        this.reservationId = null;
        this.reservationUsage = List.of();
        this.rowLevelSecurityStatistics = null;
        this.scriptStatistics = null;
        this.sessionInfo = null;
        this.startTime = null;
        this.totalSlotMs = null;
        this.transactionInfo = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatisticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double completionRatio;
        private String creationTime;
        private String endTime;
        private JobStatistics4Response extract;
        private JobStatistics3Response load;
        private String numChildJobs;
        private String parentJobId;
        private JobStatistics2Response query;
        private List<String> quotaDeferments;
        private String reservationId;
        private List<JobStatisticsReservationUsageItemResponse> reservationUsage;
        private RowLevelSecurityStatisticsResponse rowLevelSecurityStatistics;
        private ScriptStatisticsResponse scriptStatistics;
        private SessionInfoResponse sessionInfo;
        private String startTime;
        private String totalSlotMs;
        private TransactionInfoResponse transactionInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatisticsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.completionRatio = defaults.completionRatio;
    	      this.creationTime = defaults.creationTime;
    	      this.endTime = defaults.endTime;
    	      this.extract = defaults.extract;
    	      this.load = defaults.load;
    	      this.numChildJobs = defaults.numChildJobs;
    	      this.parentJobId = defaults.parentJobId;
    	      this.query = defaults.query;
    	      this.quotaDeferments = defaults.quotaDeferments;
    	      this.reservationId = defaults.reservationId;
    	      this.reservationUsage = defaults.reservationUsage;
    	      this.rowLevelSecurityStatistics = defaults.rowLevelSecurityStatistics;
    	      this.scriptStatistics = defaults.scriptStatistics;
    	      this.sessionInfo = defaults.sessionInfo;
    	      this.startTime = defaults.startTime;
    	      this.totalSlotMs = defaults.totalSlotMs;
    	      this.transactionInfo = defaults.transactionInfo;
        }

        public Builder completionRatio(Double completionRatio) {
            this.completionRatio = Objects.requireNonNull(completionRatio);
            return this;
        }
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder endTime(String endTime) {
            this.endTime = Objects.requireNonNull(endTime);
            return this;
        }
        public Builder extract(JobStatistics4Response extract) {
            this.extract = Objects.requireNonNull(extract);
            return this;
        }
        public Builder load(JobStatistics3Response load) {
            this.load = Objects.requireNonNull(load);
            return this;
        }
        public Builder numChildJobs(String numChildJobs) {
            this.numChildJobs = Objects.requireNonNull(numChildJobs);
            return this;
        }
        public Builder parentJobId(String parentJobId) {
            this.parentJobId = Objects.requireNonNull(parentJobId);
            return this;
        }
        public Builder query(JobStatistics2Response query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        public Builder quotaDeferments(List<String> quotaDeferments) {
            this.quotaDeferments = Objects.requireNonNull(quotaDeferments);
            return this;
        }
        public Builder quotaDeferments(String... quotaDeferments) {
            return quotaDeferments(List.of(quotaDeferments));
        }
        public Builder reservationId(String reservationId) {
            this.reservationId = Objects.requireNonNull(reservationId);
            return this;
        }
        public Builder reservationUsage(List<JobStatisticsReservationUsageItemResponse> reservationUsage) {
            this.reservationUsage = Objects.requireNonNull(reservationUsage);
            return this;
        }
        public Builder reservationUsage(JobStatisticsReservationUsageItemResponse... reservationUsage) {
            return reservationUsage(List.of(reservationUsage));
        }
        public Builder rowLevelSecurityStatistics(RowLevelSecurityStatisticsResponse rowLevelSecurityStatistics) {
            this.rowLevelSecurityStatistics = Objects.requireNonNull(rowLevelSecurityStatistics);
            return this;
        }
        public Builder scriptStatistics(ScriptStatisticsResponse scriptStatistics) {
            this.scriptStatistics = Objects.requireNonNull(scriptStatistics);
            return this;
        }
        public Builder sessionInfo(SessionInfoResponse sessionInfo) {
            this.sessionInfo = Objects.requireNonNull(sessionInfo);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder totalSlotMs(String totalSlotMs) {
            this.totalSlotMs = Objects.requireNonNull(totalSlotMs);
            return this;
        }
        public Builder transactionInfo(TransactionInfoResponse transactionInfo) {
            this.transactionInfo = Objects.requireNonNull(transactionInfo);
            return this;
        }        public JobStatisticsResponse build() {
            return new JobStatisticsResponse(completionRatio, creationTime, endTime, extract, load, numChildJobs, parentJobId, query, quotaDeferments, reservationId, reservationUsage, rowLevelSecurityStatistics, scriptStatistics, sessionInfo, startTime, totalSlotMs, transactionInfo);
        }
    }
}
