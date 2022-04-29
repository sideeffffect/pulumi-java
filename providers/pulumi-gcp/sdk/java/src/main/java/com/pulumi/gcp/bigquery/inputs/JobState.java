// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.bigquery.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.bigquery.inputs.JobCopyArgs;
import com.pulumi.gcp.bigquery.inputs.JobExtractArgs;
import com.pulumi.gcp.bigquery.inputs.JobLoadArgs;
import com.pulumi.gcp.bigquery.inputs.JobQueryArgs;
import com.pulumi.gcp.bigquery.inputs.JobStatusArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class JobState extends ResourceArgs {

    public static final JobState Empty = new JobState();

    /**
     * Copies a table.
     * Structure is documented below.
     * 
     */
    @Import(name="copy")
    private @Nullable Output<JobCopyArgs> copy;

    /**
     * @return Copies a table.
     * Structure is documented below.
     * 
     */
    public Optional<Output<JobCopyArgs>> copy() {
        return Optional.ofNullable(this.copy);
    }

    /**
     * Configures an extract job.
     * Structure is documented below.
     * 
     */
    @Import(name="extract")
    private @Nullable Output<JobExtractArgs> extract;

    /**
     * @return Configures an extract job.
     * Structure is documented below.
     * 
     */
    public Optional<Output<JobExtractArgs>> extract() {
        return Optional.ofNullable(this.extract);
    }

    /**
     * The ID of the job. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-). The maximum length is 1,024 characters.
     * 
     */
    @Import(name="jobId")
    private @Nullable Output<String> jobId;

    /**
     * @return The ID of the job. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-). The maximum length is 1,024 characters.
     * 
     */
    public Optional<Output<String>> jobId() {
        return Optional.ofNullable(this.jobId);
    }

    /**
     * Job timeout in milliseconds. If this time limit is exceeded, BigQuery may attempt to terminate the job.
     * 
     */
    @Import(name="jobTimeoutMs")
    private @Nullable Output<String> jobTimeoutMs;

    /**
     * @return Job timeout in milliseconds. If this time limit is exceeded, BigQuery may attempt to terminate the job.
     * 
     */
    public Optional<Output<String>> jobTimeoutMs() {
        return Optional.ofNullable(this.jobTimeoutMs);
    }

    /**
     * The type of the job.
     * 
     */
    @Import(name="jobType")
    private @Nullable Output<String> jobType;

    /**
     * @return The type of the job.
     * 
     */
    public Optional<Output<String>> jobType() {
        return Optional.ofNullable(this.jobType);
    }

    /**
     * The labels associated with this job. You can use these to organize and group your jobs.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,String>> labels;

    /**
     * @return The labels associated with this job. You can use these to organize and group your jobs.
     * 
     */
    public Optional<Output<Map<String,String>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * Configures a load job.
     * Structure is documented below.
     * 
     */
    @Import(name="load")
    private @Nullable Output<JobLoadArgs> load;

    /**
     * @return Configures a load job.
     * Structure is documented below.
     * 
     */
    public Optional<Output<JobLoadArgs>> load() {
        return Optional.ofNullable(this.load);
    }

    /**
     * The geographic location of the job. The default value is US.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The geographic location of the job. The default value is US.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Configures a query job.
     * Structure is documented below.
     * 
     */
    @Import(name="query")
    private @Nullable Output<JobQueryArgs> query;

    /**
     * @return Configures a query job.
     * Structure is documented below.
     * 
     */
    public Optional<Output<JobQueryArgs>> query() {
        return Optional.ofNullable(this.query);
    }

    /**
     * The status of this job. Examine this value when polling an asynchronous job to see if the job is complete.
     * 
     */
    @Import(name="statuses")
    private @Nullable Output<List<JobStatusArgs>> statuses;

    /**
     * @return The status of this job. Examine this value when polling an asynchronous job to see if the job is complete.
     * 
     */
    public Optional<Output<List<JobStatusArgs>>> statuses() {
        return Optional.ofNullable(this.statuses);
    }

    /**
     * Email address of the user who ran the job.
     * 
     */
    @Import(name="userEmail")
    private @Nullable Output<String> userEmail;

    /**
     * @return Email address of the user who ran the job.
     * 
     */
    public Optional<Output<String>> userEmail() {
        return Optional.ofNullable(this.userEmail);
    }

    private JobState() {}

    private JobState(JobState $) {
        this.copy = $.copy;
        this.extract = $.extract;
        this.jobId = $.jobId;
        this.jobTimeoutMs = $.jobTimeoutMs;
        this.jobType = $.jobType;
        this.labels = $.labels;
        this.load = $.load;
        this.location = $.location;
        this.project = $.project;
        this.query = $.query;
        this.statuses = $.statuses;
        this.userEmail = $.userEmail;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobState $;

        public Builder() {
            $ = new JobState();
        }

        public Builder(JobState defaults) {
            $ = new JobState(Objects.requireNonNull(defaults));
        }

        /**
         * @param copy Copies a table.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder copy(@Nullable Output<JobCopyArgs> copy) {
            $.copy = copy;
            return this;
        }

        /**
         * @param copy Copies a table.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder copy(JobCopyArgs copy) {
            return copy(Output.of(copy));
        }

        /**
         * @param extract Configures an extract job.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder extract(@Nullable Output<JobExtractArgs> extract) {
            $.extract = extract;
            return this;
        }

        /**
         * @param extract Configures an extract job.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder extract(JobExtractArgs extract) {
            return extract(Output.of(extract));
        }

        /**
         * @param jobId The ID of the job. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-). The maximum length is 1,024 characters.
         * 
         * @return builder
         * 
         */
        public Builder jobId(@Nullable Output<String> jobId) {
            $.jobId = jobId;
            return this;
        }

        /**
         * @param jobId The ID of the job. The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or dashes (-). The maximum length is 1,024 characters.
         * 
         * @return builder
         * 
         */
        public Builder jobId(String jobId) {
            return jobId(Output.of(jobId));
        }

        /**
         * @param jobTimeoutMs Job timeout in milliseconds. If this time limit is exceeded, BigQuery may attempt to terminate the job.
         * 
         * @return builder
         * 
         */
        public Builder jobTimeoutMs(@Nullable Output<String> jobTimeoutMs) {
            $.jobTimeoutMs = jobTimeoutMs;
            return this;
        }

        /**
         * @param jobTimeoutMs Job timeout in milliseconds. If this time limit is exceeded, BigQuery may attempt to terminate the job.
         * 
         * @return builder
         * 
         */
        public Builder jobTimeoutMs(String jobTimeoutMs) {
            return jobTimeoutMs(Output.of(jobTimeoutMs));
        }

        /**
         * @param jobType The type of the job.
         * 
         * @return builder
         * 
         */
        public Builder jobType(@Nullable Output<String> jobType) {
            $.jobType = jobType;
            return this;
        }

        /**
         * @param jobType The type of the job.
         * 
         * @return builder
         * 
         */
        public Builder jobType(String jobType) {
            return jobType(Output.of(jobType));
        }

        /**
         * @param labels The labels associated with this job. You can use these to organize and group your jobs.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels The labels associated with this job. You can use these to organize and group your jobs.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,String> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param load Configures a load job.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder load(@Nullable Output<JobLoadArgs> load) {
            $.load = load;
            return this;
        }

        /**
         * @param load Configures a load job.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder load(JobLoadArgs load) {
            return load(Output.of(load));
        }

        /**
         * @param location The geographic location of the job. The default value is US.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The geographic location of the job. The default value is US.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param query Configures a query job.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable Output<JobQueryArgs> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query Configures a query job.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder query(JobQueryArgs query) {
            return query(Output.of(query));
        }

        /**
         * @param statuses The status of this job. Examine this value when polling an asynchronous job to see if the job is complete.
         * 
         * @return builder
         * 
         */
        public Builder statuses(@Nullable Output<List<JobStatusArgs>> statuses) {
            $.statuses = statuses;
            return this;
        }

        /**
         * @param statuses The status of this job. Examine this value when polling an asynchronous job to see if the job is complete.
         * 
         * @return builder
         * 
         */
        public Builder statuses(List<JobStatusArgs> statuses) {
            return statuses(Output.of(statuses));
        }

        /**
         * @param statuses The status of this job. Examine this value when polling an asynchronous job to see if the job is complete.
         * 
         * @return builder
         * 
         */
        public Builder statuses(JobStatusArgs... statuses) {
            return statuses(List.of(statuses));
        }

        /**
         * @param userEmail Email address of the user who ran the job.
         * 
         * @return builder
         * 
         */
        public Builder userEmail(@Nullable Output<String> userEmail) {
            $.userEmail = userEmail;
            return this;
        }

        /**
         * @param userEmail Email address of the user who ran the job.
         * 
         * @return builder
         * 
         */
        public Builder userEmail(String userEmail) {
            return userEmail(Output.of(userEmail));
        }

        public JobState build() {
            return $;
        }
    }

}
