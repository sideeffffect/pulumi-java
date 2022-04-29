// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.detective.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.resources.InvokeArgs;
import java.lang.String;
import java.util.Objects;


public final class GetMemberInvitationArgs extends InvokeArgs {

    public static final GetMemberInvitationArgs Empty = new GetMemberInvitationArgs();

    /**
     * The ARN of the graph to which the member account will be invited
     * 
     */
    @Import(name="graphArn", required=true)
    private String graphArn;

    /**
     * @return The ARN of the graph to which the member account will be invited
     * 
     */
    public String graphArn() {
        return this.graphArn;
    }

    /**
     * The AWS account ID to be invited to join the graph as a member
     * 
     */
    @Import(name="memberId", required=true)
    private String memberId;

    /**
     * @return The AWS account ID to be invited to join the graph as a member
     * 
     */
    public String memberId() {
        return this.memberId;
    }

    private GetMemberInvitationArgs() {}

    private GetMemberInvitationArgs(GetMemberInvitationArgs $) {
        this.graphArn = $.graphArn;
        this.memberId = $.memberId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMemberInvitationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMemberInvitationArgs $;

        public Builder() {
            $ = new GetMemberInvitationArgs();
        }

        public Builder(GetMemberInvitationArgs defaults) {
            $ = new GetMemberInvitationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param graphArn The ARN of the graph to which the member account will be invited
         * 
         * @return builder
         * 
         */
        public Builder graphArn(String graphArn) {
            $.graphArn = graphArn;
            return this;
        }

        /**
         * @param memberId The AWS account ID to be invited to join the graph as a member
         * 
         * @return builder
         * 
         */
        public Builder memberId(String memberId) {
            $.memberId = memberId;
            return this;
        }

        public GetMemberInvitationArgs build() {
            $.graphArn = Objects.requireNonNull($.graphArn, "expected parameter 'graphArn' to be non-null");
            $.memberId = Objects.requireNonNull($.memberId, "expected parameter 'memberId' to be non-null");
            return $;
        }
    }

}
