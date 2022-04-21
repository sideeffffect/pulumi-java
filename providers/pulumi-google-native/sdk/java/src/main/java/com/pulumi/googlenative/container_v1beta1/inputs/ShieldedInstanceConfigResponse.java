// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


/**
 * A set of Shielded Instance options.
 * 
 */
public final class ShieldedInstanceConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final ShieldedInstanceConfigResponse Empty = new ShieldedInstanceConfigResponse();

    /**
     * Defines whether the instance has integrity monitoring enabled. Enables monitoring and attestation of the boot integrity of the instance. The attestation is performed against the integrity policy baseline. This baseline is initially derived from the implicitly trusted boot image when the instance is created.
     * 
     */
    @Import(name="enableIntegrityMonitoring", required=true)
    private Boolean enableIntegrityMonitoring;

    public Boolean enableIntegrityMonitoring() {
        return this.enableIntegrityMonitoring;
    }

    /**
     * Defines whether the instance has Secure Boot enabled. Secure Boot helps ensure that the system only runs authentic software by verifying the digital signature of all boot components, and halting the boot process if signature verification fails.
     * 
     */
    @Import(name="enableSecureBoot", required=true)
    private Boolean enableSecureBoot;

    public Boolean enableSecureBoot() {
        return this.enableSecureBoot;
    }

    private ShieldedInstanceConfigResponse() {}

    private ShieldedInstanceConfigResponse(ShieldedInstanceConfigResponse $) {
        this.enableIntegrityMonitoring = $.enableIntegrityMonitoring;
        this.enableSecureBoot = $.enableSecureBoot;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ShieldedInstanceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ShieldedInstanceConfigResponse $;

        public Builder() {
            $ = new ShieldedInstanceConfigResponse();
        }

        public Builder(ShieldedInstanceConfigResponse defaults) {
            $ = new ShieldedInstanceConfigResponse(Objects.requireNonNull(defaults));
        }

        public Builder enableIntegrityMonitoring(Boolean enableIntegrityMonitoring) {
            $.enableIntegrityMonitoring = enableIntegrityMonitoring;
            return this;
        }

        public Builder enableSecureBoot(Boolean enableSecureBoot) {
            $.enableSecureBoot = enableSecureBoot;
            return this;
        }

        public ShieldedInstanceConfigResponse build() {
            $.enableIntegrityMonitoring = Objects.requireNonNull($.enableIntegrityMonitoring, "expected parameter 'enableIntegrityMonitoring' to be non-null");
            $.enableSecureBoot = Objects.requireNonNull($.enableSecureBoot, "expected parameter 'enableSecureBoot' to be non-null");
            return $;
        }
    }

}
