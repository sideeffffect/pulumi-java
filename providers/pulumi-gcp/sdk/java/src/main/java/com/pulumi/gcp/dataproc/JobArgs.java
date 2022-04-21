// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.dataproc.inputs.JobHadoopConfigArgs;
import com.pulumi.gcp.dataproc.inputs.JobHiveConfigArgs;
import com.pulumi.gcp.dataproc.inputs.JobPigConfigArgs;
import com.pulumi.gcp.dataproc.inputs.JobPlacementArgs;
import com.pulumi.gcp.dataproc.inputs.JobPysparkConfigArgs;
import com.pulumi.gcp.dataproc.inputs.JobReferenceArgs;
import com.pulumi.gcp.dataproc.inputs.JobSchedulingArgs;
import com.pulumi.gcp.dataproc.inputs.JobSparkConfigArgs;
import com.pulumi.gcp.dataproc.inputs.JobSparksqlConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * By default, you can only delete inactive jobs within
     * Dataproc. Setting this to true, and calling destroy, will ensure that the
     * job is first cancelled before issuing the delete.
     * 
     */
    @Import(name="forceDelete")
    private @Nullable Output<Boolean> forceDelete;

    public Optional<Output<Boolean>> forceDelete() {
        return Optional.ofNullable(this.forceDelete);
    }

    /**
     * The config of Hadoop job
     * 
     */
    @Import(name="hadoopConfig")
    private @Nullable Output<JobHadoopConfigArgs> hadoopConfig;

    public Optional<Output<JobHadoopConfigArgs>> hadoopConfig() {
        return Optional.ofNullable(this.hadoopConfig);
    }

    /**
     * The config of hive job
     * 
     */
    @Import(name="hiveConfig")
    private @Nullable Output<JobHiveConfigArgs> hiveConfig;

    public Optional<Output<JobHiveConfigArgs>> hiveConfig() {
        return Optional.ofNullable(this.hiveConfig);
    }

    /**
     * The list of labels (key/value pairs) to add to the job.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The config of pag job.
     * 
     */
    @Import(name="pigConfig")
    private @Nullable Output<JobPigConfigArgs> pigConfig;

    public Optional<Output<JobPigConfigArgs>> pigConfig() {
        return Optional.ofNullable(this.pigConfig);
    }

    /**
     * The config of job placement.
     * 
     */
    @Import(name="placement", required=true)
    private Output<JobPlacementArgs> placement;

    public Output<JobPlacementArgs> placement() {
        return this.placement;
    }

    /**
     * The project in which the `cluster` can be found and jobs
     * subsequently run against. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * The config of pySpark job.
     * 
     */
    @Import(name="pysparkConfig")
    private @Nullable Output<JobPysparkConfigArgs> pysparkConfig;

    public Optional<Output<JobPysparkConfigArgs>> pysparkConfig() {
        return Optional.ofNullable(this.pysparkConfig);
    }

    /**
     * The reference of the job
     * 
     */
    @Import(name="reference")
    private @Nullable Output<JobReferenceArgs> reference;

    public Optional<Output<JobReferenceArgs>> reference() {
        return Optional.ofNullable(this.reference);
    }

    /**
     * The Cloud Dataproc region. This essentially determines which clusters are available
     * for this job to be submitted to. If not specified, defaults to `global`.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * Optional. Job scheduling configuration.
     * 
     */
    @Import(name="scheduling")
    private @Nullable Output<JobSchedulingArgs> scheduling;

    public Optional<Output<JobSchedulingArgs>> scheduling() {
        return Optional.ofNullable(this.scheduling);
    }

    /**
     * The config of the Spark job.
     * 
     */
    @Import(name="sparkConfig")
    private @Nullable Output<JobSparkConfigArgs> sparkConfig;

    public Optional<Output<JobSparkConfigArgs>> sparkConfig() {
        return Optional.ofNullable(this.sparkConfig);
    }

    /**
     * The config of SparkSql job
     * 
     */
    @Import(name="sparksqlConfig")
    private @Nullable Output<JobSparksqlConfigArgs> sparksqlConfig;

    public Optional<Output<JobSparksqlConfigArgs>> sparksqlConfig() {
        return Optional.ofNullable(this.sparksqlConfig);
    }

    private JobArgs() {}

    private JobArgs(JobArgs $) {
        this.forceDelete = $.forceDelete;
        this.hadoopConfig = $.hadoopConfig;
        this.hiveConfig = $.hiveConfig;
        this.labels = $.labels;
        this.pigConfig = $.pigConfig;
        this.placement = $.placement;
        this.project = $.project;
        this.pysparkConfig = $.pysparkConfig;
        this.reference = $.reference;
        this.region = $.region;
        this.scheduling = $.scheduling;
        this.sparkConfig = $.sparkConfig;
        this.sparksqlConfig = $.sparksqlConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobArgs $;

        public Builder() {
            $ = new JobArgs();
        }

        public Builder(JobArgs defaults) {
            $ = new JobArgs(Objects.requireNonNull(defaults));
        }

        public Builder forceDelete(@Nullable Output<Boolean> forceDelete) {
            $.forceDelete = forceDelete;
            return this;
        }

        public Builder forceDelete(Boolean forceDelete) {
            return forceDelete(Output.of(forceDelete));
        }

        public Builder hadoopConfig(@Nullable Output<JobHadoopConfigArgs> hadoopConfig) {
            $.hadoopConfig = hadoopConfig;
            return this;
        }

        public Builder hadoopConfig(JobHadoopConfigArgs hadoopConfig) {
            return hadoopConfig(Output.of(hadoopConfig));
        }

        public Builder hiveConfig(@Nullable Output<JobHiveConfigArgs> hiveConfig) {
            $.hiveConfig = hiveConfig;
            return this;
        }

        public Builder hiveConfig(JobHiveConfigArgs hiveConfig) {
            return hiveConfig(Output.of(hiveConfig));
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        public Builder pigConfig(@Nullable Output<JobPigConfigArgs> pigConfig) {
            $.pigConfig = pigConfig;
            return this;
        }

        public Builder pigConfig(JobPigConfigArgs pigConfig) {
            return pigConfig(Output.of(pigConfig));
        }

        public Builder placement(Output<JobPlacementArgs> placement) {
            $.placement = placement;
            return this;
        }

        public Builder placement(JobPlacementArgs placement) {
            return placement(Output.of(placement));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder pysparkConfig(@Nullable Output<JobPysparkConfigArgs> pysparkConfig) {
            $.pysparkConfig = pysparkConfig;
            return this;
        }

        public Builder pysparkConfig(JobPysparkConfigArgs pysparkConfig) {
            return pysparkConfig(Output.of(pysparkConfig));
        }

        public Builder reference(@Nullable Output<JobReferenceArgs> reference) {
            $.reference = reference;
            return this;
        }

        public Builder reference(JobReferenceArgs reference) {
            return reference(Output.of(reference));
        }

        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        public Builder region(String region) {
            return region(Output.of(region));
        }

        public Builder scheduling(@Nullable Output<JobSchedulingArgs> scheduling) {
            $.scheduling = scheduling;
            return this;
        }

        public Builder scheduling(JobSchedulingArgs scheduling) {
            return scheduling(Output.of(scheduling));
        }

        public Builder sparkConfig(@Nullable Output<JobSparkConfigArgs> sparkConfig) {
            $.sparkConfig = sparkConfig;
            return this;
        }

        public Builder sparkConfig(JobSparkConfigArgs sparkConfig) {
            return sparkConfig(Output.of(sparkConfig));
        }

        public Builder sparksqlConfig(@Nullable Output<JobSparksqlConfigArgs> sparksqlConfig) {
            $.sparksqlConfig = sparksqlConfig;
            return this;
        }

        public Builder sparksqlConfig(JobSparksqlConfigArgs sparksqlConfig) {
            return sparksqlConfig(Output.of(sparksqlConfig));
        }

        public JobArgs build() {
            $.placement = Objects.requireNonNull($.placement, "expected parameter 'placement' to be non-null");
            return $;
        }
    }

}
