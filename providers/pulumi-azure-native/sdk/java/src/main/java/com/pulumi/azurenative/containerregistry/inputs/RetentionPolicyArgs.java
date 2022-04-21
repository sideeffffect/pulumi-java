// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.azurenative.containerregistry.enums.PolicyStatus;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The retention policy for a container registry.
 * 
 */
public final class RetentionPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final RetentionPolicyArgs Empty = new RetentionPolicyArgs();

    /**
     * The number of days to retain an untagged manifest after which it gets purged.
     * 
     */
    @Import(name="days")
    private @Nullable Output<Integer> days;

    public Optional<Output<Integer>> days() {
        return Optional.ofNullable(this.days);
    }

    /**
     * The value that indicates whether the policy is enabled or not.
     * 
     */
    @Import(name="status")
    private @Nullable Output<Either<String,PolicyStatus>> status;

    public Optional<Output<Either<String,PolicyStatus>>> status() {
        return Optional.ofNullable(this.status);
    }

    private RetentionPolicyArgs() {}

    private RetentionPolicyArgs(RetentionPolicyArgs $) {
        this.days = $.days;
        this.status = $.status;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RetentionPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RetentionPolicyArgs $;

        public Builder() {
            $ = new RetentionPolicyArgs();
        }

        public Builder(RetentionPolicyArgs defaults) {
            $ = new RetentionPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder days(@Nullable Output<Integer> days) {
            $.days = days;
            return this;
        }

        public Builder days(Integer days) {
            return days(Output.of(days));
        }

        public Builder status(@Nullable Output<Either<String,PolicyStatus>> status) {
            $.status = status;
            return this;
        }

        public Builder status(Either<String,PolicyStatus> status) {
            return status(Output.of(status));
        }

        public RetentionPolicyArgs build() {
            $.days = Codegen.integerProp("days").output().arg($.days).def(7).getNullable();
            $.status = Codegen.stringProp("status").left(PolicyStatus.class).output().arg($.status).def("disabled").getNullable();
            return $;
        }
    }

}
