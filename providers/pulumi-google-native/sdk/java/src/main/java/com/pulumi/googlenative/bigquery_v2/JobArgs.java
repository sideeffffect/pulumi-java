// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2;

import com.pulumi.asset.AssetOrArchive;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.bigquery_v2.inputs.JobConfigurationArgs;
import com.pulumi.googlenative.bigquery_v2.inputs.JobReferenceArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

    /**
     * [Required] Describes the job configuration.
     * 
     */
    @Import(name="configuration")
      private final @Nullable Output<JobConfigurationArgs> configuration;

    public Output<JobConfigurationArgs> configuration() {
        return this.configuration == null ? Codegen.empty() : this.configuration;
    }

    /**
     * [Optional] Reference describing the unique-per-user name of the job.
     * 
     */
    @Import(name="jobReference")
      private final @Nullable Output<JobReferenceArgs> jobReference;

    public Output<JobReferenceArgs> jobReference() {
        return this.jobReference == null ? Codegen.empty() : this.jobReference;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="source")
      private final @Nullable Output<AssetOrArchive> source;

    public Output<AssetOrArchive> source() {
        return this.source == null ? Codegen.empty() : this.source;
    }

    public JobArgs(
        @Nullable Output<JobConfigurationArgs> configuration,
        @Nullable Output<JobReferenceArgs> jobReference,
        @Nullable Output<String> project,
        @Nullable Output<AssetOrArchive> source) {
        this.configuration = configuration;
        this.jobReference = jobReference;
        this.project = project;
        this.source = source;
    }

    private JobArgs() {
        this.configuration = Codegen.empty();
        this.jobReference = Codegen.empty();
        this.project = Codegen.empty();
        this.source = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<JobConfigurationArgs> configuration;
        private @Nullable Output<JobReferenceArgs> jobReference;
        private @Nullable Output<String> project;
        private @Nullable Output<AssetOrArchive> source;

        public Builder() {
    	      // Empty
        }

        public Builder(JobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configuration = defaults.configuration;
    	      this.jobReference = defaults.jobReference;
    	      this.project = defaults.project;
    	      this.source = defaults.source;
        }

        public Builder configuration(@Nullable Output<JobConfigurationArgs> configuration) {
            this.configuration = configuration;
            return this;
        }
        public Builder configuration(@Nullable JobConfigurationArgs configuration) {
            this.configuration = Codegen.ofNullable(configuration);
            return this;
        }
        public Builder jobReference(@Nullable Output<JobReferenceArgs> jobReference) {
            this.jobReference = jobReference;
            return this;
        }
        public Builder jobReference(@Nullable JobReferenceArgs jobReference) {
            this.jobReference = Codegen.ofNullable(jobReference);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder source(@Nullable Output<AssetOrArchive> source) {
            this.source = source;
            return this;
        }
        public Builder source(@Nullable AssetOrArchive source) {
            this.source = Codegen.ofNullable(source);
            return this;
        }        public JobArgs build() {
            return new JobArgs(configuration, jobReference, project, source);
        }
    }
}
