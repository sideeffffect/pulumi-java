// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class GetInstanceShieldedInstanceConfig extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceShieldedInstanceConfig Empty = new GetInstanceShieldedInstanceConfig();

    @Import(name="enableIntegrityMonitoring", required=true)
    private Boolean enableIntegrityMonitoring;

    public Boolean enableIntegrityMonitoring() {
        return this.enableIntegrityMonitoring;
    }

    @Import(name="enableSecureBoot", required=true)
    private Boolean enableSecureBoot;

    public Boolean enableSecureBoot() {
        return this.enableSecureBoot;
    }

    @Import(name="enableVtpm", required=true)
    private Boolean enableVtpm;

    public Boolean enableVtpm() {
        return this.enableVtpm;
    }

    private GetInstanceShieldedInstanceConfig() {}

    private GetInstanceShieldedInstanceConfig(GetInstanceShieldedInstanceConfig $) {
        this.enableIntegrityMonitoring = $.enableIntegrityMonitoring;
        this.enableSecureBoot = $.enableSecureBoot;
        this.enableVtpm = $.enableVtpm;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceShieldedInstanceConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceShieldedInstanceConfig $;

        public Builder() {
            $ = new GetInstanceShieldedInstanceConfig();
        }

        public Builder(GetInstanceShieldedInstanceConfig defaults) {
            $ = new GetInstanceShieldedInstanceConfig(Objects.requireNonNull(defaults));
        }

        public Builder enableIntegrityMonitoring(Boolean enableIntegrityMonitoring) {
            $.enableIntegrityMonitoring = enableIntegrityMonitoring;
            return this;
        }

        public Builder enableSecureBoot(Boolean enableSecureBoot) {
            $.enableSecureBoot = enableSecureBoot;
            return this;
        }

        public Builder enableVtpm(Boolean enableVtpm) {
            $.enableVtpm = enableVtpm;
            return this;
        }

        public GetInstanceShieldedInstanceConfig build() {
            $.enableIntegrityMonitoring = Objects.requireNonNull($.enableIntegrityMonitoring, "expected parameter 'enableIntegrityMonitoring' to be non-null");
            $.enableSecureBoot = Objects.requireNonNull($.enableSecureBoot, "expected parameter 'enableSecureBoot' to be non-null");
            $.enableVtpm = Objects.requireNonNull($.enableVtpm, "expected parameter 'enableVtpm' to be non-null");
            return $;
        }
    }

}
