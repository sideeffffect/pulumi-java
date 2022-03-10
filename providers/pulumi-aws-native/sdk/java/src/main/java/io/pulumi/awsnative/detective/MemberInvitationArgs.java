// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.detective;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MemberInvitationArgs extends io.pulumi.resources.ResourceArgs {

    public static final MemberInvitationArgs Empty = new MemberInvitationArgs();

    /**
     * When set to true, invitation emails are not sent to the member accounts. Member accounts must still accept the invitation before they are added to the behavior graph. Updating this field has no effect.
     * 
     */
    @InputImport(name="disableEmailNotification")
      private final @Nullable Input<Boolean> disableEmailNotification;

    public Input<Boolean> getDisableEmailNotification() {
        return this.disableEmailNotification == null ? Input.empty() : this.disableEmailNotification;
    }

    /**
     * The ARN of the graph to which the member account will be invited
     * 
     */
    @InputImport(name="graphArn", required=true)
      private final Input<String> graphArn;

    public Input<String> getGraphArn() {
        return this.graphArn;
    }

    /**
     * The root email address for the account to be invited, for validation. Updating this field has no effect.
     * 
     */
    @InputImport(name="memberEmailAddress", required=true)
      private final Input<String> memberEmailAddress;

    public Input<String> getMemberEmailAddress() {
        return this.memberEmailAddress;
    }

    /**
     * The AWS account ID to be invited to join the graph as a member
     * 
     */
    @InputImport(name="memberId", required=true)
      private final Input<String> memberId;

    public Input<String> getMemberId() {
        return this.memberId;
    }

    /**
     * A message to be included in the email invitation sent to the invited account. Updating this field has no effect.
     * 
     */
    @InputImport(name="message")
      private final @Nullable Input<String> message;

    public Input<String> getMessage() {
        return this.message == null ? Input.empty() : this.message;
    }

    public MemberInvitationArgs(
        @Nullable Input<Boolean> disableEmailNotification,
        Input<String> graphArn,
        Input<String> memberEmailAddress,
        Input<String> memberId,
        @Nullable Input<String> message) {
        this.disableEmailNotification = disableEmailNotification;
        this.graphArn = Objects.requireNonNull(graphArn, "expected parameter 'graphArn' to be non-null");
        this.memberEmailAddress = Objects.requireNonNull(memberEmailAddress, "expected parameter 'memberEmailAddress' to be non-null");
        this.memberId = Objects.requireNonNull(memberId, "expected parameter 'memberId' to be non-null");
        this.message = message;
    }

    private MemberInvitationArgs() {
        this.disableEmailNotification = Input.empty();
        this.graphArn = Input.empty();
        this.memberEmailAddress = Input.empty();
        this.memberId = Input.empty();
        this.message = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MemberInvitationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> disableEmailNotification;
        private Input<String> graphArn;
        private Input<String> memberEmailAddress;
        private Input<String> memberId;
        private @Nullable Input<String> message;

        public Builder() {
    	      // Empty
        }

        public Builder(MemberInvitationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableEmailNotification = defaults.disableEmailNotification;
    	      this.graphArn = defaults.graphArn;
    	      this.memberEmailAddress = defaults.memberEmailAddress;
    	      this.memberId = defaults.memberId;
    	      this.message = defaults.message;
        }

        public Builder disableEmailNotification(@Nullable Input<Boolean> disableEmailNotification) {
            this.disableEmailNotification = disableEmailNotification;
            return this;
        }

        public Builder disableEmailNotification(@Nullable Boolean disableEmailNotification) {
            this.disableEmailNotification = Input.ofNullable(disableEmailNotification);
            return this;
        }

        public Builder graphArn(Input<String> graphArn) {
            this.graphArn = Objects.requireNonNull(graphArn);
            return this;
        }

        public Builder graphArn(String graphArn) {
            this.graphArn = Input.of(Objects.requireNonNull(graphArn));
            return this;
        }

        public Builder memberEmailAddress(Input<String> memberEmailAddress) {
            this.memberEmailAddress = Objects.requireNonNull(memberEmailAddress);
            return this;
        }

        public Builder memberEmailAddress(String memberEmailAddress) {
            this.memberEmailAddress = Input.of(Objects.requireNonNull(memberEmailAddress));
            return this;
        }

        public Builder memberId(Input<String> memberId) {
            this.memberId = Objects.requireNonNull(memberId);
            return this;
        }

        public Builder memberId(String memberId) {
            this.memberId = Input.of(Objects.requireNonNull(memberId));
            return this;
        }

        public Builder message(@Nullable Input<String> message) {
            this.message = message;
            return this;
        }

        public Builder message(@Nullable String message) {
            this.message = Input.ofNullable(message);
            return this;
        }
        public MemberInvitationArgs build() {
            return new MemberInvitationArgs(disableEmailNotification, graphArn, memberEmailAddress, memberId, message);
        }
    }
}
