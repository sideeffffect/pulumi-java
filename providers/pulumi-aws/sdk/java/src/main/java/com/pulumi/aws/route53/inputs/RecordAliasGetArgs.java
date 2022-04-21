// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class RecordAliasGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RecordAliasGetArgs Empty = new RecordAliasGetArgs();

    /**
     * Set to `true` if you want Route 53 to determine whether to respond to DNS queries using this resource record set by checking the health of the resource record set. Some resources have special requirements, see [related part of documentation](https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/resource-record-sets-values.html#rrsets-values-alias-evaluate-target-health).
     * 
     */
    @Import(name="evaluateTargetHealth", required=true)
    private Output<Boolean> evaluateTargetHealth;

    public Output<Boolean> evaluateTargetHealth() {
        return this.evaluateTargetHealth;
    }

    /**
     * DNS domain name for a CloudFront distribution, S3 bucket, ELB, or another resource record set in this hosted zone.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Hosted zone ID for a CloudFront distribution, S3 bucket, ELB, or Route 53 hosted zone. See `resource_elb.zone_id` for example.
     * 
     */
    @Import(name="zoneId", required=true)
    private Output<String> zoneId;

    public Output<String> zoneId() {
        return this.zoneId;
    }

    private RecordAliasGetArgs() {}

    private RecordAliasGetArgs(RecordAliasGetArgs $) {
        this.evaluateTargetHealth = $.evaluateTargetHealth;
        this.name = $.name;
        this.zoneId = $.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RecordAliasGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RecordAliasGetArgs $;

        public Builder() {
            $ = new RecordAliasGetArgs();
        }

        public Builder(RecordAliasGetArgs defaults) {
            $ = new RecordAliasGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder evaluateTargetHealth(Output<Boolean> evaluateTargetHealth) {
            $.evaluateTargetHealth = evaluateTargetHealth;
            return this;
        }

        public Builder evaluateTargetHealth(Boolean evaluateTargetHealth) {
            return evaluateTargetHealth(Output.of(evaluateTargetHealth));
        }

        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder zoneId(Output<String> zoneId) {
            $.zoneId = zoneId;
            return this;
        }

        public Builder zoneId(String zoneId) {
            return zoneId(Output.of(zoneId));
        }

        public RecordAliasGetArgs build() {
            $.evaluateTargetHealth = Objects.requireNonNull($.evaluateTargetHealth, "expected parameter 'evaluateTargetHealth' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.zoneId = Objects.requireNonNull($.zoneId, "expected parameter 'zoneId' to be non-null");
            return $;
        }
    }

}
