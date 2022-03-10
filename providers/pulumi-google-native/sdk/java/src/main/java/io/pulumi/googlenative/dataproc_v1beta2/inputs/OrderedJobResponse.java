// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.HadoopJobResponse;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.HiveJobResponse;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.JobSchedulingResponse;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.PigJobResponse;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.PrestoJobResponse;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.PySparkJobResponse;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.SparkJobResponse;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.SparkRJobResponse;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.SparkSqlJobResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * A job executed by the workflow.
 * 
 */
public final class OrderedJobResponse extends io.pulumi.resources.InvokeArgs {

    public static final OrderedJobResponse Empty = new OrderedJobResponse();

    /**
     * Optional. Job is a Hadoop job.
     * 
     */
    @InputImport(name="hadoopJob", required=true)
      private final HadoopJobResponse hadoopJob;

    public HadoopJobResponse getHadoopJob() {
        return this.hadoopJob;
    }

    /**
     * Optional. Job is a Hive job.
     * 
     */
    @InputImport(name="hiveJob", required=true)
      private final HiveJobResponse hiveJob;

    public HiveJobResponse getHiveJob() {
        return this.hiveJob;
    }

    /**
     * Optional. The labels to associate with this job.Label keys must be between 1 and 63 characters long, and must conform to the following regular expression: \p{Ll}\p{Lo}{0,62}Label values must be between 1 and 63 characters long, and must conform to the following regular expression: \p{Ll}\p{Lo}\p{N}_-{0,63}No more than 32 labels can be associated with a given job.
     * 
     */
    @InputImport(name="labels", required=true)
      private final Map<String,String> labels;

    public Map<String,String> getLabels() {
        return this.labels;
    }

    /**
     * Optional. Job is a Pig job.
     * 
     */
    @InputImport(name="pigJob", required=true)
      private final PigJobResponse pigJob;

    public PigJobResponse getPigJob() {
        return this.pigJob;
    }

    /**
     * Optional. The optional list of prerequisite job step_ids. If not specified, the job will start at the beginning of workflow.
     * 
     */
    @InputImport(name="prerequisiteStepIds", required=true)
      private final List<String> prerequisiteStepIds;

    public List<String> getPrerequisiteStepIds() {
        return this.prerequisiteStepIds;
    }

    /**
     * Optional. Job is a Presto job.
     * 
     */
    @InputImport(name="prestoJob", required=true)
      private final PrestoJobResponse prestoJob;

    public PrestoJobResponse getPrestoJob() {
        return this.prestoJob;
    }

    /**
     * Optional. Job is a PySpark job.
     * 
     */
    @InputImport(name="pysparkJob", required=true)
      private final PySparkJobResponse pysparkJob;

    public PySparkJobResponse getPysparkJob() {
        return this.pysparkJob;
    }

    /**
     * Optional. Job scheduling configuration.
     * 
     */
    @InputImport(name="scheduling", required=true)
      private final JobSchedulingResponse scheduling;

    public JobSchedulingResponse getScheduling() {
        return this.scheduling;
    }

    /**
     * Optional. Job is a Spark job.
     * 
     */
    @InputImport(name="sparkJob", required=true)
      private final SparkJobResponse sparkJob;

    public SparkJobResponse getSparkJob() {
        return this.sparkJob;
    }

    /**
     * Optional. Job is a SparkR job.
     * 
     */
    @InputImport(name="sparkRJob", required=true)
      private final SparkRJobResponse sparkRJob;

    public SparkRJobResponse getSparkRJob() {
        return this.sparkRJob;
    }

    /**
     * Optional. Job is a SparkSql job.
     * 
     */
    @InputImport(name="sparkSqlJob", required=true)
      private final SparkSqlJobResponse sparkSqlJob;

    public SparkSqlJobResponse getSparkSqlJob() {
        return this.sparkSqlJob;
    }

    /**
     * The step id. The id must be unique among all jobs within the template.The step id is used as prefix for job id, as job goog-dataproc-workflow-step-id label, and in prerequisiteStepIds field from other steps.The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between 3 and 50 characters.
     * 
     */
    @InputImport(name="stepId", required=true)
      private final String stepId;

    public String getStepId() {
        return this.stepId;
    }

    public OrderedJobResponse(
        HadoopJobResponse hadoopJob,
        HiveJobResponse hiveJob,
        Map<String,String> labels,
        PigJobResponse pigJob,
        List<String> prerequisiteStepIds,
        PrestoJobResponse prestoJob,
        PySparkJobResponse pysparkJob,
        JobSchedulingResponse scheduling,
        SparkJobResponse sparkJob,
        SparkRJobResponse sparkRJob,
        SparkSqlJobResponse sparkSqlJob,
        String stepId) {
        this.hadoopJob = Objects.requireNonNull(hadoopJob, "expected parameter 'hadoopJob' to be non-null");
        this.hiveJob = Objects.requireNonNull(hiveJob, "expected parameter 'hiveJob' to be non-null");
        this.labels = Objects.requireNonNull(labels, "expected parameter 'labels' to be non-null");
        this.pigJob = Objects.requireNonNull(pigJob, "expected parameter 'pigJob' to be non-null");
        this.prerequisiteStepIds = Objects.requireNonNull(prerequisiteStepIds, "expected parameter 'prerequisiteStepIds' to be non-null");
        this.prestoJob = Objects.requireNonNull(prestoJob, "expected parameter 'prestoJob' to be non-null");
        this.pysparkJob = Objects.requireNonNull(pysparkJob, "expected parameter 'pysparkJob' to be non-null");
        this.scheduling = Objects.requireNonNull(scheduling, "expected parameter 'scheduling' to be non-null");
        this.sparkJob = Objects.requireNonNull(sparkJob, "expected parameter 'sparkJob' to be non-null");
        this.sparkRJob = Objects.requireNonNull(sparkRJob, "expected parameter 'sparkRJob' to be non-null");
        this.sparkSqlJob = Objects.requireNonNull(sparkSqlJob, "expected parameter 'sparkSqlJob' to be non-null");
        this.stepId = Objects.requireNonNull(stepId, "expected parameter 'stepId' to be non-null");
    }

    private OrderedJobResponse() {
        this.hadoopJob = null;
        this.hiveJob = null;
        this.labels = Map.of();
        this.pigJob = null;
        this.prerequisiteStepIds = List.of();
        this.prestoJob = null;
        this.pysparkJob = null;
        this.scheduling = null;
        this.sparkJob = null;
        this.sparkRJob = null;
        this.sparkSqlJob = null;
        this.stepId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrderedJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HadoopJobResponse hadoopJob;
        private HiveJobResponse hiveJob;
        private Map<String,String> labels;
        private PigJobResponse pigJob;
        private List<String> prerequisiteStepIds;
        private PrestoJobResponse prestoJob;
        private PySparkJobResponse pysparkJob;
        private JobSchedulingResponse scheduling;
        private SparkJobResponse sparkJob;
        private SparkRJobResponse sparkRJob;
        private SparkSqlJobResponse sparkSqlJob;
        private String stepId;

        public Builder() {
    	      // Empty
        }

        public Builder(OrderedJobResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hadoopJob = defaults.hadoopJob;
    	      this.hiveJob = defaults.hiveJob;
    	      this.labels = defaults.labels;
    	      this.pigJob = defaults.pigJob;
    	      this.prerequisiteStepIds = defaults.prerequisiteStepIds;
    	      this.prestoJob = defaults.prestoJob;
    	      this.pysparkJob = defaults.pysparkJob;
    	      this.scheduling = defaults.scheduling;
    	      this.sparkJob = defaults.sparkJob;
    	      this.sparkRJob = defaults.sparkRJob;
    	      this.sparkSqlJob = defaults.sparkSqlJob;
    	      this.stepId = defaults.stepId;
        }

        public Builder hadoopJob(HadoopJobResponse hadoopJob) {
            this.hadoopJob = Objects.requireNonNull(hadoopJob);
            return this;
        }

        public Builder hiveJob(HiveJobResponse hiveJob) {
            this.hiveJob = Objects.requireNonNull(hiveJob);
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder pigJob(PigJobResponse pigJob) {
            this.pigJob = Objects.requireNonNull(pigJob);
            return this;
        }

        public Builder prerequisiteStepIds(List<String> prerequisiteStepIds) {
            this.prerequisiteStepIds = Objects.requireNonNull(prerequisiteStepIds);
            return this;
        }

        public Builder prestoJob(PrestoJobResponse prestoJob) {
            this.prestoJob = Objects.requireNonNull(prestoJob);
            return this;
        }

        public Builder pysparkJob(PySparkJobResponse pysparkJob) {
            this.pysparkJob = Objects.requireNonNull(pysparkJob);
            return this;
        }

        public Builder scheduling(JobSchedulingResponse scheduling) {
            this.scheduling = Objects.requireNonNull(scheduling);
            return this;
        }

        public Builder sparkJob(SparkJobResponse sparkJob) {
            this.sparkJob = Objects.requireNonNull(sparkJob);
            return this;
        }

        public Builder sparkRJob(SparkRJobResponse sparkRJob) {
            this.sparkRJob = Objects.requireNonNull(sparkRJob);
            return this;
        }

        public Builder sparkSqlJob(SparkSqlJobResponse sparkSqlJob) {
            this.sparkSqlJob = Objects.requireNonNull(sparkSqlJob);
            return this;
        }

        public Builder stepId(String stepId) {
            this.stepId = Objects.requireNonNull(stepId);
            return this;
        }
        public OrderedJobResponse build() {
            return new OrderedJobResponse(hadoopJob, hiveJob, labels, pigJob, prerequisiteStepIds, prestoJob, pysparkJob, scheduling, sparkJob, sparkRJob, sparkSqlJob, stepId);
        }
    }
}
