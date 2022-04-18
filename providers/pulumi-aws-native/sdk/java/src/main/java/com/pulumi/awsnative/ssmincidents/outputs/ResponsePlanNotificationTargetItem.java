// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssmincidents.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResponsePlanNotificationTargetItem {
    private final @Nullable String snsTopicArn;

    @CustomType.Constructor
    private ResponsePlanNotificationTargetItem(@CustomType.Parameter("snsTopicArn") @Nullable String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    public Optional<String> snsTopicArn() {
        return Optional.ofNullable(this.snsTopicArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponsePlanNotificationTargetItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String snsTopicArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponsePlanNotificationTargetItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.snsTopicArn = defaults.snsTopicArn;
        }

        public Builder snsTopicArn(@Nullable String snsTopicArn) {
            this.snsTopicArn = snsTopicArn;
            return this;
        }        public ResponsePlanNotificationTargetItem build() {
            return new ResponsePlanNotificationTargetItem(snsTopicArn);
        }
    }
}
