// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * A certificate managed by App Engine.
 * 
 */
public final class ManagedCertificateResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagedCertificateResponse Empty = new ManagedCertificateResponse();

    /**
     * Time at which the certificate was last renewed. The renewal process is fully managed. Certificate renewal will automatically occur before the certificate expires. Renewal errors can be tracked via ManagementStatus.
     * 
     */
    @Import(name="lastRenewalTime", required=true)
    private String lastRenewalTime;

    public String lastRenewalTime() {
        return this.lastRenewalTime;
    }

    /**
     * Status of certificate management. Refers to the most recent certificate acquisition or renewal attempt.
     * 
     */
    @Import(name="status", required=true)
    private String status;

    public String status() {
        return this.status;
    }

    private ManagedCertificateResponse() {}

    private ManagedCertificateResponse(ManagedCertificateResponse $) {
        this.lastRenewalTime = $.lastRenewalTime;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedCertificateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedCertificateResponse $;

        public Builder() {
            $ = new ManagedCertificateResponse();
        }

        public Builder(ManagedCertificateResponse defaults) {
            $ = new ManagedCertificateResponse(Objects.requireNonNull(defaults));
        }

        public Builder lastRenewalTime(String lastRenewalTime) {
            $.lastRenewalTime = lastRenewalTime;
            return this;
        }

        public Builder status(String status) {
            $.status = status;
            return this;
        }

        public ManagedCertificateResponse build() {
            $.lastRenewalTime = Objects.requireNonNull($.lastRenewalTime, "expected parameter 'lastRenewalTime' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
