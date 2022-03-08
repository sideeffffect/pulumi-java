// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class ConditionResponse {
    /**
     * Trusted attributes supplied by the IAM system.
     * 
     */
    private final String iam;
    /**
     * An operator to apply the subject with.
     * 
     */
    private final String op;
    /**
     * Trusted attributes discharged by the service.
     * 
     */
    private final String svc;
    /**
     * Trusted attributes supplied by any service that owns resources and uses the IAM system for access control.
     * 
     */
    private final String sys;
    /**
     * The objects of the condition.
     * 
     */
    private final List<String> values;

    @OutputCustomType.Constructor({"iam","op","svc","sys","values"})
    private ConditionResponse(
        String iam,
        String op,
        String svc,
        String sys,
        List<String> values) {
        this.iam = iam;
        this.op = op;
        this.svc = svc;
        this.sys = sys;
        this.values = values;
    }

    /**
     * Trusted attributes supplied by the IAM system.
     * 
    */
    public String getIam() {
        return this.iam;
    }
    /**
     * An operator to apply the subject with.
     * 
    */
    public String getOp() {
        return this.op;
    }
    /**
     * Trusted attributes discharged by the service.
     * 
    */
    public String getSvc() {
        return this.svc;
    }
    /**
     * Trusted attributes supplied by any service that owns resources and uses the IAM system for access control.
     * 
    */
    public String getSys() {
        return this.sys;
    }
    /**
     * The objects of the condition.
     * 
    */
    public List<String> getValues() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String iam;
        private String op;
        private String svc;
        private String sys;
        private List<String> values;

        public Builder() {
    	      // Empty
        }

        public Builder(ConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.iam = defaults.iam;
    	      this.op = defaults.op;
    	      this.svc = defaults.svc;
    	      this.sys = defaults.sys;
    	      this.values = defaults.values;
        }

        public Builder setIam(String iam) {
            this.iam = Objects.requireNonNull(iam);
            return this;
        }

        public Builder setOp(String op) {
            this.op = Objects.requireNonNull(op);
            return this;
        }

        public Builder setSvc(String svc) {
            this.svc = Objects.requireNonNull(svc);
            return this;
        }

        public Builder setSys(String sys) {
            this.sys = Objects.requireNonNull(sys);
            return this;
        }

        public Builder setValues(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public ConditionResponse build() {
            return new ConditionResponse(iam, op, svc, sys, values);
        }
    }
}
