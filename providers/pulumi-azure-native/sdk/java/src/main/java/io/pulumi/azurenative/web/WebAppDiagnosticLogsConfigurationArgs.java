// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.web.inputs.ApplicationLogsConfigArgs;
import io.pulumi.azurenative.web.inputs.EnabledConfigArgs;
import io.pulumi.azurenative.web.inputs.HttpLogsConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppDiagnosticLogsConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppDiagnosticLogsConfigurationArgs Empty = new WebAppDiagnosticLogsConfigurationArgs();

    /**
     * Application logs configuration.
     * 
     */
    @InputImport(name="applicationLogs")
      private final @Nullable Input<ApplicationLogsConfigArgs> applicationLogs;

    public Input<ApplicationLogsConfigArgs> getApplicationLogs() {
        return this.applicationLogs == null ? Input.empty() : this.applicationLogs;
    }

    /**
     * Detailed error messages configuration.
     * 
     */
    @InputImport(name="detailedErrorMessages")
      private final @Nullable Input<EnabledConfigArgs> detailedErrorMessages;

    public Input<EnabledConfigArgs> getDetailedErrorMessages() {
        return this.detailedErrorMessages == null ? Input.empty() : this.detailedErrorMessages;
    }

    /**
     * Failed requests tracing configuration.
     * 
     */
    @InputImport(name="failedRequestsTracing")
      private final @Nullable Input<EnabledConfigArgs> failedRequestsTracing;

    public Input<EnabledConfigArgs> getFailedRequestsTracing() {
        return this.failedRequestsTracing == null ? Input.empty() : this.failedRequestsTracing;
    }

    /**
     * HTTP logs configuration.
     * 
     */
    @InputImport(name="httpLogs")
      private final @Nullable Input<HttpLogsConfigArgs> httpLogs;

    public Input<HttpLogsConfigArgs> getHttpLogs() {
        return this.httpLogs == null ? Input.empty() : this.httpLogs;
    }

    /**
     * Kind of resource.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Name of the app.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public WebAppDiagnosticLogsConfigurationArgs(
        @Nullable Input<ApplicationLogsConfigArgs> applicationLogs,
        @Nullable Input<EnabledConfigArgs> detailedErrorMessages,
        @Nullable Input<EnabledConfigArgs> failedRequestsTracing,
        @Nullable Input<HttpLogsConfigArgs> httpLogs,
        @Nullable Input<String> kind,
        Input<String> name,
        Input<String> resourceGroupName) {
        this.applicationLogs = applicationLogs;
        this.detailedErrorMessages = detailedErrorMessages;
        this.failedRequestsTracing = failedRequestsTracing;
        this.httpLogs = httpLogs;
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private WebAppDiagnosticLogsConfigurationArgs() {
        this.applicationLogs = Input.empty();
        this.detailedErrorMessages = Input.empty();
        this.failedRequestsTracing = Input.empty();
        this.httpLogs = Input.empty();
        this.kind = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppDiagnosticLogsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ApplicationLogsConfigArgs> applicationLogs;
        private @Nullable Input<EnabledConfigArgs> detailedErrorMessages;
        private @Nullable Input<EnabledConfigArgs> failedRequestsTracing;
        private @Nullable Input<HttpLogsConfigArgs> httpLogs;
        private @Nullable Input<String> kind;
        private Input<String> name;
        private Input<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppDiagnosticLogsConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationLogs = defaults.applicationLogs;
    	      this.detailedErrorMessages = defaults.detailedErrorMessages;
    	      this.failedRequestsTracing = defaults.failedRequestsTracing;
    	      this.httpLogs = defaults.httpLogs;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder applicationLogs(@Nullable Input<ApplicationLogsConfigArgs> applicationLogs) {
            this.applicationLogs = applicationLogs;
            return this;
        }

        public Builder applicationLogs(@Nullable ApplicationLogsConfigArgs applicationLogs) {
            this.applicationLogs = Input.ofNullable(applicationLogs);
            return this;
        }

        public Builder detailedErrorMessages(@Nullable Input<EnabledConfigArgs> detailedErrorMessages) {
            this.detailedErrorMessages = detailedErrorMessages;
            return this;
        }

        public Builder detailedErrorMessages(@Nullable EnabledConfigArgs detailedErrorMessages) {
            this.detailedErrorMessages = Input.ofNullable(detailedErrorMessages);
            return this;
        }

        public Builder failedRequestsTracing(@Nullable Input<EnabledConfigArgs> failedRequestsTracing) {
            this.failedRequestsTracing = failedRequestsTracing;
            return this;
        }

        public Builder failedRequestsTracing(@Nullable EnabledConfigArgs failedRequestsTracing) {
            this.failedRequestsTracing = Input.ofNullable(failedRequestsTracing);
            return this;
        }

        public Builder httpLogs(@Nullable Input<HttpLogsConfigArgs> httpLogs) {
            this.httpLogs = httpLogs;
            return this;
        }

        public Builder httpLogs(@Nullable HttpLogsConfigArgs httpLogs) {
            this.httpLogs = Input.ofNullable(httpLogs);
            return this;
        }

        public Builder kind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder name(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public WebAppDiagnosticLogsConfigurationArgs build() {
            return new WebAppDiagnosticLogsConfigurationArgs(applicationLogs, detailedErrorMessages, failedRequestsTracing, httpLogs, kind, name, resourceGroupName);
        }
    }
}
