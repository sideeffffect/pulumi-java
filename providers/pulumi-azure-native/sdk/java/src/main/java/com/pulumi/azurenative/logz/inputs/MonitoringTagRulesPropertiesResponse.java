// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logz.inputs;

import com.pulumi.azurenative.logz.inputs.LogRulesResponse;
import com.pulumi.azurenative.logz.inputs.SystemDataResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of the properties for a TagRules resource.
 * 
 */
public final class MonitoringTagRulesPropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final MonitoringTagRulesPropertiesResponse Empty = new MonitoringTagRulesPropertiesResponse();

    /**
     * Set of rules for sending logs for the Monitor resource.
     * 
     */
    @Import(name="logRules")
    private @Nullable LogRulesResponse logRules;

    public Optional<LogRulesResponse> logRules() {
        return Optional.ofNullable(this.logRules);
    }

    /**
     * Flag specifying if the resource provisioning state as tracked by ARM.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Metadata pertaining to creation and last modification of the resource.
     * 
     */
    @Import(name="systemData", required=true)
    private SystemDataResponse systemData;

    public SystemDataResponse systemData() {
        return this.systemData;
    }

    private MonitoringTagRulesPropertiesResponse() {}

    private MonitoringTagRulesPropertiesResponse(MonitoringTagRulesPropertiesResponse $) {
        this.logRules = $.logRules;
        this.provisioningState = $.provisioningState;
        this.systemData = $.systemData;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitoringTagRulesPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoringTagRulesPropertiesResponse $;

        public Builder() {
            $ = new MonitoringTagRulesPropertiesResponse();
        }

        public Builder(MonitoringTagRulesPropertiesResponse defaults) {
            $ = new MonitoringTagRulesPropertiesResponse(Objects.requireNonNull(defaults));
        }

        public Builder logRules(@Nullable LogRulesResponse logRules) {
            $.logRules = logRules;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder systemData(SystemDataResponse systemData) {
            $.systemData = systemData;
            return this;
        }

        public MonitoringTagRulesPropertiesResponse build() {
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            $.systemData = Objects.requireNonNull($.systemData, "expected parameter 'systemData' to be non-null");
            return $;
        }
    }

}
