// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVersionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVersionArgs Empty = new GetVersionArgs();

    @Import(name="appId", required=true)
      private final String appId;

    public String appId() {
        return this.appId;
    }

    @Import(name="serviceId", required=true)
      private final String serviceId;

    public String serviceId() {
        return this.serviceId;
    }

    @Import(name="versionId", required=true)
      private final String versionId;

    public String versionId() {
        return this.versionId;
    }

    @Import(name="view")
      private final @Nullable String view;

    public Optional<String> view() {
        return this.view == null ? Optional.empty() : Optional.ofNullable(this.view);
    }

    public GetVersionArgs(
        String appId,
        String serviceId,
        String versionId,
        @Nullable String view) {
        this.appId = Objects.requireNonNull(appId, "expected parameter 'appId' to be non-null");
        this.serviceId = Objects.requireNonNull(serviceId, "expected parameter 'serviceId' to be non-null");
        this.versionId = Objects.requireNonNull(versionId, "expected parameter 'versionId' to be non-null");
        this.view = view;
    }

    private GetVersionArgs() {
        this.appId = null;
        this.serviceId = null;
        this.versionId = null;
        this.view = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appId;
        private String serviceId;
        private String versionId;
        private @Nullable String view;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.serviceId = defaults.serviceId;
    	      this.versionId = defaults.versionId;
    	      this.view = defaults.view;
        }

        public Builder appId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }
        public Builder serviceId(String serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }
        public Builder versionId(String versionId) {
            this.versionId = Objects.requireNonNull(versionId);
            return this;
        }
        public Builder view(@Nullable String view) {
            this.view = view;
            return this;
        }        public GetVersionArgs build() {
            return new GetVersionArgs(appId, serviceId, versionId, view);
        }
    }
}
