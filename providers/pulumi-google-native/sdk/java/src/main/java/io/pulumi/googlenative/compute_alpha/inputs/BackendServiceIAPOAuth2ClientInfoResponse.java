// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class BackendServiceIAPOAuth2ClientInfoResponse extends io.pulumi.resources.InvokeArgs {

    public static final BackendServiceIAPOAuth2ClientInfoResponse Empty = new BackendServiceIAPOAuth2ClientInfoResponse();

    /**
     * Application name to be used in OAuth consent screen.
     * 
     */
    @InputImport(name="applicationName", required=true)
      private final String applicationName;

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * Name of the client to be generated. Optional - If not provided, the name will be autogenerated by the backend.
     * 
     */
    @InputImport(name="clientName", required=true)
      private final String clientName;

    public String getClientName() {
        return this.clientName;
    }

    /**
     * Developer's information to be used in OAuth consent screen.
     * 
     */
    @InputImport(name="developerEmailAddress", required=true)
      private final String developerEmailAddress;

    public String getDeveloperEmailAddress() {
        return this.developerEmailAddress;
    }

    public BackendServiceIAPOAuth2ClientInfoResponse(
        String applicationName,
        String clientName,
        String developerEmailAddress) {
        this.applicationName = Objects.requireNonNull(applicationName, "expected parameter 'applicationName' to be non-null");
        this.clientName = Objects.requireNonNull(clientName, "expected parameter 'clientName' to be non-null");
        this.developerEmailAddress = Objects.requireNonNull(developerEmailAddress, "expected parameter 'developerEmailAddress' to be non-null");
    }

    private BackendServiceIAPOAuth2ClientInfoResponse() {
        this.applicationName = null;
        this.clientName = null;
        this.developerEmailAddress = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceIAPOAuth2ClientInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationName;
        private String clientName;
        private String developerEmailAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceIAPOAuth2ClientInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationName = defaults.applicationName;
    	      this.clientName = defaults.clientName;
    	      this.developerEmailAddress = defaults.developerEmailAddress;
        }

        public Builder applicationName(String applicationName) {
            this.applicationName = Objects.requireNonNull(applicationName);
            return this;
        }

        public Builder clientName(String clientName) {
            this.clientName = Objects.requireNonNull(clientName);
            return this;
        }

        public Builder developerEmailAddress(String developerEmailAddress) {
            this.developerEmailAddress = Objects.requireNonNull(developerEmailAddress);
            return this;
        }
        public BackendServiceIAPOAuth2ClientInfoResponse build() {
            return new BackendServiceIAPOAuth2ClientInfoResponse(applicationName, clientName, developerEmailAddress);
        }
    }
}
