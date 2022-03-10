// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackendServiceIAPOAuth2ClientInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendServiceIAPOAuth2ClientInfoArgs Empty = new BackendServiceIAPOAuth2ClientInfoArgs();

    /**
     * Application name to be used in OAuth consent screen.
     * 
     */
    @InputImport(name="applicationName")
      private final @Nullable Input<String> applicationName;

    public Input<String> getApplicationName() {
        return this.applicationName == null ? Input.empty() : this.applicationName;
    }

    /**
     * Name of the client to be generated. Optional - If not provided, the name will be autogenerated by the backend.
     * 
     */
    @InputImport(name="clientName")
      private final @Nullable Input<String> clientName;

    public Input<String> getClientName() {
        return this.clientName == null ? Input.empty() : this.clientName;
    }

    /**
     * Developer's information to be used in OAuth consent screen.
     * 
     */
    @InputImport(name="developerEmailAddress")
      private final @Nullable Input<String> developerEmailAddress;

    public Input<String> getDeveloperEmailAddress() {
        return this.developerEmailAddress == null ? Input.empty() : this.developerEmailAddress;
    }

    public BackendServiceIAPOAuth2ClientInfoArgs(
        @Nullable Input<String> applicationName,
        @Nullable Input<String> clientName,
        @Nullable Input<String> developerEmailAddress) {
        this.applicationName = applicationName;
        this.clientName = clientName;
        this.developerEmailAddress = developerEmailAddress;
    }

    private BackendServiceIAPOAuth2ClientInfoArgs() {
        this.applicationName = Input.empty();
        this.clientName = Input.empty();
        this.developerEmailAddress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceIAPOAuth2ClientInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> applicationName;
        private @Nullable Input<String> clientName;
        private @Nullable Input<String> developerEmailAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceIAPOAuth2ClientInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationName = defaults.applicationName;
    	      this.clientName = defaults.clientName;
    	      this.developerEmailAddress = defaults.developerEmailAddress;
        }

        public Builder applicationName(@Nullable Input<String> applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        public Builder applicationName(@Nullable String applicationName) {
            this.applicationName = Input.ofNullable(applicationName);
            return this;
        }

        public Builder clientName(@Nullable Input<String> clientName) {
            this.clientName = clientName;
            return this;
        }

        public Builder clientName(@Nullable String clientName) {
            this.clientName = Input.ofNullable(clientName);
            return this;
        }

        public Builder developerEmailAddress(@Nullable Input<String> developerEmailAddress) {
            this.developerEmailAddress = developerEmailAddress;
            return this;
        }

        public Builder developerEmailAddress(@Nullable String developerEmailAddress) {
            this.developerEmailAddress = Input.ofNullable(developerEmailAddress);
            return this;
        }
        public BackendServiceIAPOAuth2ClientInfoArgs build() {
            return new BackendServiceIAPOAuth2ClientInfoArgs(applicationName, clientName, developerEmailAddress);
        }
    }
}
