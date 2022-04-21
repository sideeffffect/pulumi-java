// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.guestconfiguration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Information about VMSS VM
 * 
 */
public final class VMSSVMInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final VMSSVMInfoResponse Empty = new VMSSVMInfoResponse();

    /**
     * A value indicating compliance status of the machine for the assigned guest configuration.
     * 
     */
    @Import(name="complianceStatus", required=true)
    private String complianceStatus;

    public String complianceStatus() {
        return this.complianceStatus;
    }

    /**
     * Date and time when last compliance status was checked.
     * 
     */
    @Import(name="lastComplianceChecked", required=true)
    private String lastComplianceChecked;

    public String lastComplianceChecked() {
        return this.lastComplianceChecked;
    }

    /**
     * Id of the latest report for the guest configuration assignment.
     * 
     */
    @Import(name="latestReportId", required=true)
    private String latestReportId;

    public String latestReportId() {
        return this.latestReportId;
    }

    /**
     * UUID of the VM.
     * 
     */
    @Import(name="vmId", required=true)
    private String vmId;

    public String vmId() {
        return this.vmId;
    }

    /**
     * Azure resource Id of the VM.
     * 
     */
    @Import(name="vmResourceId", required=true)
    private String vmResourceId;

    public String vmResourceId() {
        return this.vmResourceId;
    }

    private VMSSVMInfoResponse() {}

    private VMSSVMInfoResponse(VMSSVMInfoResponse $) {
        this.complianceStatus = $.complianceStatus;
        this.lastComplianceChecked = $.lastComplianceChecked;
        this.latestReportId = $.latestReportId;
        this.vmId = $.vmId;
        this.vmResourceId = $.vmResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VMSSVMInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VMSSVMInfoResponse $;

        public Builder() {
            $ = new VMSSVMInfoResponse();
        }

        public Builder(VMSSVMInfoResponse defaults) {
            $ = new VMSSVMInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder complianceStatus(String complianceStatus) {
            $.complianceStatus = complianceStatus;
            return this;
        }

        public Builder lastComplianceChecked(String lastComplianceChecked) {
            $.lastComplianceChecked = lastComplianceChecked;
            return this;
        }

        public Builder latestReportId(String latestReportId) {
            $.latestReportId = latestReportId;
            return this;
        }

        public Builder vmId(String vmId) {
            $.vmId = vmId;
            return this;
        }

        public Builder vmResourceId(String vmResourceId) {
            $.vmResourceId = vmResourceId;
            return this;
        }

        public VMSSVMInfoResponse build() {
            $.complianceStatus = Objects.requireNonNull($.complianceStatus, "expected parameter 'complianceStatus' to be non-null");
            $.lastComplianceChecked = Objects.requireNonNull($.lastComplianceChecked, "expected parameter 'lastComplianceChecked' to be non-null");
            $.latestReportId = Objects.requireNonNull($.latestReportId, "expected parameter 'latestReportId' to be non-null");
            $.vmId = Objects.requireNonNull($.vmId, "expected parameter 'vmId' to be non-null");
            $.vmResourceId = Objects.requireNonNull($.vmResourceId, "expected parameter 'vmResourceId' to be non-null");
            return $;
        }
    }

}
