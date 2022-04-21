// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class BackendServiceIAPOAuth2ClientInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final BackendServiceIAPOAuth2ClientInfoResponse Empty = new BackendServiceIAPOAuth2ClientInfoResponse();

    /**
     * Application name to be used in OAuth consent screen.
     * 
     */
    @Import(name="applicationName", required=true)
    private String applicationName;

    public String applicationName() {
        return this.applicationName;
    }

    /**
     * Name of the client to be generated. Optional - If not provided, the name will be autogenerated by the backend.
     * 
     */
    @Import(name="clientName", required=true)
    private String clientName;

    public String clientName() {
        return this.clientName;
    }

    /**
     * Developer&#39;s information to be used in OAuth consent screen.
     * 
     */
    @Import(name="developerEmailAddress", required=true)
    private String developerEmailAddress;

    public String developerEmailAddress() {
        return this.developerEmailAddress;
    }

    private BackendServiceIAPOAuth2ClientInfoResponse() {}

    private BackendServiceIAPOAuth2ClientInfoResponse(BackendServiceIAPOAuth2ClientInfoResponse $) {
        this.applicationName = $.applicationName;
        this.clientName = $.clientName;
        this.developerEmailAddress = $.developerEmailAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendServiceIAPOAuth2ClientInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceIAPOAuth2ClientInfoResponse $;

        public Builder() {
            $ = new BackendServiceIAPOAuth2ClientInfoResponse();
        }

        public Builder(BackendServiceIAPOAuth2ClientInfoResponse defaults) {
            $ = new BackendServiceIAPOAuth2ClientInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder applicationName(String applicationName) {
            $.applicationName = applicationName;
            return this;
        }

        public Builder clientName(String clientName) {
            $.clientName = clientName;
            return this;
        }

        public Builder developerEmailAddress(String developerEmailAddress) {
            $.developerEmailAddress = developerEmailAddress;
            return this;
        }

        public BackendServiceIAPOAuth2ClientInfoResponse build() {
            $.applicationName = Objects.requireNonNull($.applicationName, "expected parameter 'applicationName' to be non-null");
            $.clientName = Objects.requireNonNull($.clientName, "expected parameter 'clientName' to be non-null");
            $.developerEmailAddress = Objects.requireNonNull($.developerEmailAddress, "expected parameter 'developerEmailAddress' to be non-null");
            return $;
        }
    }

}
