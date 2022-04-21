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
     * [TrustedTester] [Output-only] Job progress (0.0 -&gt; 1.0) for LOAD and EXTRACT jobs.
     * 
     */
    @Import(name="completionRatio", required=true)
    private Double completionRatio;

    public Double completionRatio() {
        return this.completionRatio;
    }

    /**
     * Creation time of this job, in milliseconds since the epoch. This field will be present on all jobs.
     * 
     */
    @Import(name="creationTime", required=true)
    private String creationTime;

    public String creationTime() {
        return this.creationTime;
    }

    /**
     * End time of this job, in milliseconds since the epoch. This field will be present whenever a job is in the DONE state.
     * 
     */
    @Import(name="endTime", required=true)
    private String endTime;

    public String endTime() {
        return this.endTime;
    }

    /**
     * Statistics for an extract job.
     * 
     */
    @Import(name="extract", required=true)
    private JobStatistics4Response extract;

    public JobStatistics4Response extract() {
        return this.extract;
    }

    /**
     * Statistics for a load job.
     * 
     */
    @Import(name="load", required=true)
    private JobStatistics3Response load;

    public JobStatistics3Response load() {
        return this.load;
    }

    /**
     * Number of child jobs executed.
     * 
     */
    @Import(name="numChildJobs", required=true)
    private String numChildJobs;

    public String numChildJobs() {
        return this.numChildJobs;
    }

    /**
     * If this is a child job, the id of the parent.
     * 
     */
    @Import(name="parentJobId", required=true)
    private String parentJobId;

    public String parentJobId() {
        return this.parentJobId;
    }

    /**
     * Statistics for a query job.
     * 
     */
    @Import(name="query", required=true)
    private JobStatistics2Response query;

    public JobStatistics2Response query() {
        return this.query;
    }

    /**
     * Quotas which delayed this job&#39;s start time.
     * 
     */
    @Import(name="quotaDeferments", required=true)
    private List<String> quotaDeferments;

    public List<String> quotaDeferments() {
        return this.quotaDeferments;
    }

    /**
     * Name of the primary reservation assigned to this job. Note that this could be different than reservations reported in the reservation usage field if parent reservations were used to execute this job.
     * 
     */
    @Import(name="reservationId", required=true)
    private String reservationId;

    public String reservationId() {
        return this.reservationId;
    }

    /**
     * Job resource usage breakdown by reservation.
     * 
     */
    @Import(name="reservationUsage", required=true)
    private List<JobStatisticsReservationUsageItemResponse> reservationUsage;

    public List<JobStatisticsReservationUsageItemResponse> reservationUsage() {
        return this.reservationUsage;
    }

    /**
     * [Preview] Statistics for row-level security. Present only for query and extract jobs.
     * 
     */
    @Import(name="rowLevelSecurityStatistics", required=true)
    private RowLevelSecurityStatisticsResponse rowLevelSecurityStatistics;

    public RowLevelSecurityStatisticsResponse rowLevelSecurityStatistics() {
        return this.rowLevelSecurityStatistics;
    }

    /**
     * Statistics for a child job of a script.
     * 
     */
    @Import(name="scriptStatistics", required=true)
    private ScriptStatisticsResponse scriptStatistics;

    public ScriptStatisticsResponse scriptStatistics() {
        return this.scriptStatistics;
    }

    /**
     * [Preview] Information of the session if this job is part of one.
     * 
     */
    @Import(name="sessionInfo", required=true)
    private SessionInfoResponse sessionInfo;

    public SessionInfoResponse sessionInfo() {
        return this.sessionInfo;
    }

    /**
     * Start time of this job, in milliseconds since the epoch. This field will be present when the job transitions from the PENDING state to either RUNNING or DONE.
     * 
     */
    @Import(name="startTime", required=true)
    private String startTime;

    public String startTime() {
        return this.startTime;
    }

    /**
     * Slot-milliseconds for the job.
     * 
     */
    @Import(name="totalSlotMs", required=true)
    private String totalSlotMs;

    public String totalSlotMs() {
        return this.totalSlotMs;
    }

    /**
     * [Alpha] Information of the multi-statement transaction if this job is part of one.
     * 
     */
    @Import(name="transactionInfo", required=true)
    private TransactionInfoResponse transactionInfo;

    public TransactionInfoResponse transactionInfo() {
        return this.transactionInfo;
    }

    private JobStatisticsResponse() {}

    private JobStatisticsResponse(JobStatisticsResponse $) {
        this.completionRatio = $.completionRatio;
        this.creationTime = $.creationTime;
        this.endTime = $.endTime;
        this.extract = $.extract;
        this.load = $.load;
        this.numChildJobs = $.numChildJobs;
        this.parentJobId = $.parentJobId;
        this.query = $.query;
        this.quotaDeferments = $.quotaDeferments;
        this.reservationId = $.reservationId;
        this.reservationUsage = $.reservationUsage;
        this.rowLevelSecurityStatistics = $.rowLevelSecurityStatistics;
        this.scriptStatistics = $.scriptStatistics;
        this.sessionInfo = $.sessionInfo;
        this.startTime = $.startTime;
        this.totalSlotMs = $.totalSlotMs;
        this.transactionInfo = $.transactionInfo;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobStatisticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobStatisticsResponse $;

        public Builder() {
            $ = new JobStatisticsResponse();
        }

        public Builder(JobStatisticsResponse defaults) {
            $ = new JobStatisticsResponse(Objects.requireNonNull(defaults));
        }

        public Builder completionRatio(Double completionRatio) {
            $.completionRatio = completionRatio;
            return this;
        }

        public Builder creationTime(String creationTime) {
            $.creationTime = creationTime;
            return this;
        }

        public Builder endTime(String endTime) {
            $.endTime = endTime;
            return this;
        }

        public Builder extract(JobStatistics4Response extract) {
            $.extract = extract;
            return this;
        }

        public Builder load(JobStatistics3Response load) {
            $.load = load;
            return this;
        }

        public Builder numChildJobs(String numChildJobs) {
            $.numChildJobs = numChildJobs;
            return this;
        }

        public Builder parentJobId(String parentJobId) {
            $.parentJobId = parentJobId;
            return this;
        }

        public Builder query(JobStatistics2Response query) {
            $.query = query;
            return this;
        }

        public Builder quotaDeferments(List<String> quotaDeferments) {
            $.quotaDeferments = quotaDeferments;
            return this;
        }

        public Builder quotaDeferments(String... quotaDeferments) {
            return quotaDeferments(List.of(quotaDeferments));
        }

        public Builder reservationId(String reservationId) {
            $.reservationId = reservationId;
            return this;
        }

        public Builder reservationUsage(List<JobStatisticsReservationUsageItemResponse> reservationUsage) {
            $.reservationUsage = reservationUsage;
            return this;
        }

        public Builder reservationUsage(JobStatisticsReservationUsageItemResponse... reservationUsage) {
            return reservationUsage(List.of(reservationUsage));
        }

        public Builder rowLevelSecurityStatistics(RowLevelSecurityStatisticsResponse rowLevelSecurityStatistics) {
            $.rowLevelSecurityStatistics = rowLevelSecurityStatistics;
            return this;
        }

        public Builder scriptStatistics(ScriptStatisticsResponse scriptStatistics) {
            $.scriptStatistics = scriptStatistics;
            return this;
        }

        public Builder sessionInfo(SessionInfoResponse sessionInfo) {
            $.sessionInfo = sessionInfo;
            return this;
        }

        public Builder startTime(String startTime) {
            $.startTime = startTime;
            return this;
        }

        public Builder totalSlotMs(String totalSlotMs) {
            $.totalSlotMs = totalSlotMs;
            return this;
        }

        public Builder transactionInfo(TransactionInfoResponse transactionInfo) {
            $.transactionInfo = transactionInfo;
            return this;
        }

        public JobStatisticsResponse build() {
            $.completionRatio = Objects.requireNonNull($.completionRatio, "expected parameter 'completionRatio' to be non-null");
            $.creationTime = Objects.requireNonNull($.creationTime, "expected parameter 'creationTime' to be non-null");
            $.endTime = Objects.requireNonNull($.endTime, "expected parameter 'endTime' to be non-null");
            $.extract = Objects.requireNonNull($.extract, "expected parameter 'extract' to be non-null");
            $.load = Objects.requireNonNull($.load, "expected parameter 'load' to be non-null");
            $.numChildJobs = Objects.requireNonNull($.numChildJobs, "expected parameter 'numChildJobs' to be non-null");
            $.parentJobId = Objects.requireNonNull($.parentJobId, "expected parameter 'parentJobId' to be non-null");
            $.query = Objects.requireNonNull($.query, "expected parameter 'query' to be non-null");
            $.quotaDeferments = Objects.requireNonNull($.quotaDeferments, "expected parameter 'quotaDeferments' to be non-null");
            $.reservationId = Objects.requireNonNull($.reservationId, "expected parameter 'reservationId' to be non-null");
            $.reservationUsage = Objects.requireNonNull($.reservationUsage, "expected parameter 'reservationUsage' to be non-null");
            $.rowLevelSecurityStatistics = Objects.requireNonNull($.rowLevelSecurityStatistics, "expected parameter 'rowLevelSecurityStatistics' to be non-null");
            $.scriptStatistics = Objects.requireNonNull($.scriptStatistics, "expected parameter 'scriptStatistics' to be non-null");
            $.sessionInfo = Objects.requireNonNull($.sessionInfo, "expected parameter 'sessionInfo' to be non-null");
            $.startTime = Objects.requireNonNull($.startTime, "expected parameter 'startTime' to be non-null");
            $.totalSlotMs = Objects.requireNonNull($.totalSlotMs, "expected parameter 'totalSlotMs' to be non-null");
            $.transactionInfo = Objects.requireNonNull($.transactionInfo, "expected parameter 'transactionInfo' to be non-null");
            return $;
        }
    }

}
