// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.gameservices_v1beta.enums.ConditionIam;
import com.pulumi.googlenative.gameservices_v1beta.enums.ConditionOp;
import com.pulumi.googlenative.gameservices_v1beta.enums.ConditionSys;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A condition to be met.
 * 
 */
public final class ConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final ConditionArgs Empty = new ConditionArgs();

    /**
     * Trusted attributes supplied by the IAM system.
     * 
     */
    @Import(name="iam")
    private @Nullable Output<ConditionIam> iam;

    public Optional<Output<ConditionIam>> iam() {
        return Optional.ofNullable(this.iam);
    }

    /**
     * An operator to apply the subject with.
     * 
     */
    @Import(name="op")
    private @Nullable Output<ConditionOp> op;

    public Optional<Output<ConditionOp>> op() {
        return Optional.ofNullable(this.op);
    }

    /**
     * Trusted attributes discharged by the service.
     * 
     */
    @Import(name="svc")
    private @Nullable Output<String> svc;

    public Optional<Output<String>> svc() {
        return Optional.ofNullable(this.svc);
    }

    /**
     * Trusted attributes supplied by any service that owns resources and uses the IAM system for access control.
     * 
     */
    @Import(name="sys")
    private @Nullable Output<ConditionSys> sys;

    public Optional<Output<ConditionSys>> sys() {
        return Optional.ofNullable(this.sys);
    }

    /**
     * The objects of the condition.
     * 
     */
    @Import(name="values")
    private @Nullable Output<List<String>> values;

    public Optional<Output<List<String>>> values() {
        return Optional.ofNullable(this.values);
    }

    private ConditionArgs() {}

    private ConditionArgs(ConditionArgs $) {
        this.iam = $.iam;
        this.op = $.op;
        this.svc = $.svc;
        this.sys = $.sys;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConditionArgs $;

        public Builder() {
            $ = new ConditionArgs();
        }

        public Builder(ConditionArgs defaults) {
            $ = new ConditionArgs(Objects.requireNonNull(defaults));
        }

        public Builder iam(@Nullable Output<ConditionIam> iam) {
            $.iam = iam;
            return this;
        }

        public Builder iam(ConditionIam iam) {
            return iam(Output.of(iam));
        }

        public Builder op(@Nullable Output<ConditionOp> op) {
            $.op = op;
            return this;
        }

        public Builder op(ConditionOp op) {
            return op(Output.of(op));
        }

        public Builder svc(@Nullable Output<String> svc) {
            $.svc = svc;
            return this;
        }

        public Builder svc(String svc) {
            return svc(Output.of(svc));
        }

        public Builder sys(@Nullable Output<ConditionSys> sys) {
            $.sys = sys;
            return this;
        }

        public Builder sys(ConditionSys sys) {
            return sys(Output.of(sys));
        }

        public Builder values(@Nullable Output<List<String>> values) {
            $.values = values;
            return this;
        }

        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        public Builder values(String... values) {
            return values(List.of(values));
        }

        public ConditionArgs build() {
            return $;
        }
    }

}
