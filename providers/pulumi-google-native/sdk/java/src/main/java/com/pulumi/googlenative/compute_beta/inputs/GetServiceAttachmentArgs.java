// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceAttachmentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceAttachmentArgs Empty = new GetServiceAttachmentArgs();

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> project() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
      private final String region;

    public String region() {
        return this.region;
    }

    @Import(name="serviceAttachment", required=true)
      private final String serviceAttachment;

    public String serviceAttachment() {
        return this.serviceAttachment;
    }

    public GetServiceAttachmentArgs(
        @Nullable String project,
        String region,
        String serviceAttachment) {
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.serviceAttachment = Objects.requireNonNull(serviceAttachment, "expected parameter 'serviceAttachment' to be non-null");
    }

    private GetServiceAttachmentArgs() {
        this.project = null;
        this.region = null;
        this.serviceAttachment = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String region;
        private String serviceAttachment;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.serviceAttachment = defaults.serviceAttachment;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder serviceAttachment(String serviceAttachment) {
            this.serviceAttachment = Objects.requireNonNull(serviceAttachment);
            return this;
        }        public GetServiceAttachmentArgs build() {
            return new GetServiceAttachmentArgs(project, region, serviceAttachment);
        }
    }
}
