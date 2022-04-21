// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Encapsulates the full scoping used to reference a job.
 * 
 */
public final class JobReferenceArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobReferenceArgs Empty = new JobReferenceArgs();

    /**
     * Optional. The job ID, which must be unique within the project.The ID must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), or hyphens (-). The maximum length is 100 characters.If not specified by the caller, the job ID will be provided by the server.
     * 
     */
    @Import(name="jobId")
    private @Nullable Output<String> jobId;

    public Optional<Output<String>> jobId() {
        return Optional.ofNullable(this.jobId);
    }

    /**
     * Optional. The ID of the Google Cloud Platform project that the job belongs to. If specified, must match the request project ID.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private JobReferenceArgs() {}

    private JobReferenceArgs(JobReferenceArgs $) {
        this.jobId = $.jobId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobReferenceArgs $;

        public Builder() {
            $ = new JobReferenceArgs();
        }

        public Builder(JobReferenceArgs defaults) {
            $ = new JobReferenceArgs(Objects.requireNonNull(defaults));
        }

        public Builder jobId(@Nullable Output<String> jobId) {
            $.jobId = jobId;
            return this;
        }

        public Builder jobId(String jobId) {
            return jobId(Output.of(jobId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public JobReferenceArgs build() {
            return $;
        }
    }

}
