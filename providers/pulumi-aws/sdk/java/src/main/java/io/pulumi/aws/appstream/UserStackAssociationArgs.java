// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserStackAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserStackAssociationArgs Empty = new UserStackAssociationArgs();

    /**
     * Authentication type for the user.
     * 
     */
    @Import(name="authenticationType", required=true)
      private final Output<String> authenticationType;

    public Output<String> authenticationType() {
        return this.authenticationType;
    }

    /**
     * Specifies whether a welcome email is sent to a user after the user is created in the user pool.
     * 
     */
    @Import(name="sendEmailNotification")
      private final @Nullable Output<Boolean> sendEmailNotification;

    public Output<Boolean> sendEmailNotification() {
        return this.sendEmailNotification == null ? Codegen.empty() : this.sendEmailNotification;
    }

    /**
     * Name of the stack that is associated with the user.
     * 
     */
    @Import(name="stackName", required=true)
      private final Output<String> stackName;

    public Output<String> stackName() {
        return this.stackName;
    }

    /**
     * Email address of the user who is associated with the stack.
     * 
     */
    @Import(name="userName", required=true)
      private final Output<String> userName;

    public Output<String> userName() {
        return this.userName;
    }

    public UserStackAssociationArgs(
        Output<String> authenticationType,
        @Nullable Output<Boolean> sendEmailNotification,
        Output<String> stackName,
        Output<String> userName) {
        this.authenticationType = Objects.requireNonNull(authenticationType, "expected parameter 'authenticationType' to be non-null");
        this.sendEmailNotification = sendEmailNotification;
        this.stackName = Objects.requireNonNull(stackName, "expected parameter 'stackName' to be non-null");
        this.userName = Objects.requireNonNull(userName, "expected parameter 'userName' to be non-null");
    }

    private UserStackAssociationArgs() {
        this.authenticationType = Codegen.empty();
        this.sendEmailNotification = Codegen.empty();
        this.stackName = Codegen.empty();
        this.userName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserStackAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> authenticationType;
        private @Nullable Output<Boolean> sendEmailNotification;
        private Output<String> stackName;
        private Output<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(UserStackAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.sendEmailNotification = defaults.sendEmailNotification;
    	      this.stackName = defaults.stackName;
    	      this.userName = defaults.userName;
        }

        public Builder authenticationType(Output<String> authenticationType) {
            this.authenticationType = Objects.requireNonNull(authenticationType);
            return this;
        }
        public Builder authenticationType(String authenticationType) {
            this.authenticationType = Output.of(Objects.requireNonNull(authenticationType));
            return this;
        }
        public Builder sendEmailNotification(@Nullable Output<Boolean> sendEmailNotification) {
            this.sendEmailNotification = sendEmailNotification;
            return this;
        }
        public Builder sendEmailNotification(@Nullable Boolean sendEmailNotification) {
            this.sendEmailNotification = Codegen.ofNullable(sendEmailNotification);
            return this;
        }
        public Builder stackName(Output<String> stackName) {
            this.stackName = Objects.requireNonNull(stackName);
            return this;
        }
        public Builder stackName(String stackName) {
            this.stackName = Output.of(Objects.requireNonNull(stackName));
            return this;
        }
        public Builder userName(Output<String> userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public Builder userName(String userName) {
            this.userName = Output.of(Objects.requireNonNull(userName));
            return this;
        }        public UserStackAssociationArgs build() {
            return new UserStackAssociationArgs(authenticationType, sendEmailNotification, stackName, userName);
        }
    }
}
