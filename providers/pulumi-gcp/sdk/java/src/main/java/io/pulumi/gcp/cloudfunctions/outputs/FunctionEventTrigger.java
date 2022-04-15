// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudfunctions.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.cloudfunctions.outputs.FunctionEventTriggerFailurePolicy;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FunctionEventTrigger {
    /**
     * The type of event to observe. For example: `"google.storage.object.finalize"`.
     * See the documentation on [calling Cloud Functions](https://cloud.google.com/functions/docs/calling/) for a
     * full reference of accepted triggers.
     * 
     */
    private final String eventType;
    /**
     * Specifies policy for failed executions. Structure is documented below.
     * 
     */
    private final @Nullable FunctionEventTriggerFailurePolicy failurePolicy;
    /**
     * Required. The name or partial URI of the resource from
     * which to observe events. For example, `"myBucket"` or `"projects/my-project/topics/my-topic"`
     * 
     */
    private final String resource;

    @CustomType.Constructor
    private FunctionEventTrigger(
        @CustomType.Parameter("eventType") String eventType,
        @CustomType.Parameter("failurePolicy") @Nullable FunctionEventTriggerFailurePolicy failurePolicy,
        @CustomType.Parameter("resource") String resource) {
        this.eventType = eventType;
        this.failurePolicy = failurePolicy;
        this.resource = resource;
    }

    /**
     * The type of event to observe. For example: `"google.storage.object.finalize"`.
     * See the documentation on [calling Cloud Functions](https://cloud.google.com/functions/docs/calling/) for a
     * full reference of accepted triggers.
     * 
    */
    public String eventType() {
        return this.eventType;
    }
    /**
     * Specifies policy for failed executions. Structure is documented below.
     * 
    */
    public Optional<FunctionEventTriggerFailurePolicy> failurePolicy() {
        return Optional.ofNullable(this.failurePolicy);
    }
    /**
     * Required. The name or partial URI of the resource from
     * which to observe events. For example, `"myBucket"` or `"projects/my-project/topics/my-topic"`
     * 
    */
    public String resource() {
        return this.resource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionEventTrigger defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String eventType;
        private @Nullable FunctionEventTriggerFailurePolicy failurePolicy;
        private String resource;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionEventTrigger defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eventType = defaults.eventType;
    	      this.failurePolicy = defaults.failurePolicy;
    	      this.resource = defaults.resource;
        }

        public Builder eventType(String eventType) {
            this.eventType = Objects.requireNonNull(eventType);
            return this;
        }
        public Builder failurePolicy(@Nullable FunctionEventTriggerFailurePolicy failurePolicy) {
            this.failurePolicy = failurePolicy;
            return this;
        }
        public Builder resource(String resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }        public FunctionEventTrigger build() {
            return new FunctionEventTrigger(eventType, failurePolicy, resource);
        }
    }
}
