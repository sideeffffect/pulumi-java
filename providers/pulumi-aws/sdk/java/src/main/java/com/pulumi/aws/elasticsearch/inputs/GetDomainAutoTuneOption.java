// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elasticsearch.inputs;

import com.pulumi.aws.elasticsearch.inputs.GetDomainAutoTuneOptionMaintenanceSchedule;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetDomainAutoTuneOption extends com.pulumi.resources.InvokeArgs {

    public static final GetDomainAutoTuneOption Empty = new GetDomainAutoTuneOption();

    /**
     * The Auto-Tune desired state for the domain.
     * 
     */
    @Import(name="desiredState", required=true)
    private String desiredState;

    public String desiredState() {
        return this.desiredState;
    }

    /**
     * A list of the nested configurations for the Auto-Tune maintenance windows of the domain.
     * 
     */
    @Import(name="maintenanceSchedules", required=true)
    private List<GetDomainAutoTuneOptionMaintenanceSchedule> maintenanceSchedules;

    public List<GetDomainAutoTuneOptionMaintenanceSchedule> maintenanceSchedules() {
        return this.maintenanceSchedules;
    }

    /**
     * Whether the domain is set to roll back to default Auto-Tune settings when disabling Auto-Tune.
     * 
     */
    @Import(name="rollbackOnDisable", required=true)
    private String rollbackOnDisable;

    public String rollbackOnDisable() {
        return this.rollbackOnDisable;
    }

    private GetDomainAutoTuneOption() {}

    private GetDomainAutoTuneOption(GetDomainAutoTuneOption $) {
        this.desiredState = $.desiredState;
        this.maintenanceSchedules = $.maintenanceSchedules;
        this.rollbackOnDisable = $.rollbackOnDisable;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDomainAutoTuneOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDomainAutoTuneOption $;

        public Builder() {
            $ = new GetDomainAutoTuneOption();
        }

        public Builder(GetDomainAutoTuneOption defaults) {
            $ = new GetDomainAutoTuneOption(Objects.requireNonNull(defaults));
        }

        public Builder desiredState(String desiredState) {
            $.desiredState = desiredState;
            return this;
        }

        public Builder maintenanceSchedules(List<GetDomainAutoTuneOptionMaintenanceSchedule> maintenanceSchedules) {
            $.maintenanceSchedules = maintenanceSchedules;
            return this;
        }

        public Builder maintenanceSchedules(GetDomainAutoTuneOptionMaintenanceSchedule... maintenanceSchedules) {
            return maintenanceSchedules(List.of(maintenanceSchedules));
        }

        public Builder rollbackOnDisable(String rollbackOnDisable) {
            $.rollbackOnDisable = rollbackOnDisable;
            return this;
        }

        public GetDomainAutoTuneOption build() {
            $.desiredState = Objects.requireNonNull($.desiredState, "expected parameter 'desiredState' to be non-null");
            $.maintenanceSchedules = Objects.requireNonNull($.maintenanceSchedules, "expected parameter 'maintenanceSchedules' to be non-null");
            $.rollbackOnDisable = Objects.requireNonNull($.rollbackOnDisable, "expected parameter 'rollbackOnDisable' to be non-null");
            return $;
        }
    }

}
