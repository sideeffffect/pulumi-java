// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class InviteAccepterArgs extends com.pulumi.resources.ResourceArgs {

    public static final InviteAccepterArgs Empty = new InviteAccepterArgs();

    /**
     * The detector ID of the member GuardDuty account.
     * 
     */
    @Import(name="detectorId", required=true)
    private Output<String> detectorId;

    public Output<String> detectorId() {
        return this.detectorId;
    }

    /**
     * AWS account ID for primary account.
     * 
     */
    @Import(name="masterAccountId", required=true)
    private Output<String> masterAccountId;

    public Output<String> masterAccountId() {
        return this.masterAccountId;
    }

    private InviteAccepterArgs() {}

    private InviteAccepterArgs(InviteAccepterArgs $) {
        this.detectorId = $.detectorId;
        this.masterAccountId = $.masterAccountId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(InviteAccepterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private InviteAccepterArgs $;

        public Builder() {
            $ = new InviteAccepterArgs();
        }

        public Builder(InviteAccepterArgs defaults) {
            $ = new InviteAccepterArgs(Objects.requireNonNull(defaults));
        }

        public Builder detectorId(Output<String> detectorId) {
            $.detectorId = detectorId;
            return this;
        }

        public Builder detectorId(String detectorId) {
            return detectorId(Output.of(detectorId));
        }

        public Builder masterAccountId(Output<String> masterAccountId) {
            $.masterAccountId = masterAccountId;
            return this;
        }

        public Builder masterAccountId(String masterAccountId) {
            return masterAccountId(Output.of(masterAccountId));
        }

        public InviteAccepterArgs build() {
            $.detectorId = Objects.requireNonNull($.detectorId, "expected parameter 'detectorId' to be non-null");
            $.masterAccountId = Objects.requireNonNull($.masterAccountId, "expected parameter 'masterAccountId' to be non-null");
            return $;
        }
    }

}
