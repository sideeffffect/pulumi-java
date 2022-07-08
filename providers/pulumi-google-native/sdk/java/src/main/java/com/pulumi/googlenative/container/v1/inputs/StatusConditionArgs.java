// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.container.v1.enums.StatusConditionCanonicalCode;
import com.pulumi.googlenative.container.v1.enums.StatusConditionCode;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * StatusCondition describes why a cluster or a node pool has a certain status (e.g., ERROR or DEGRADED).
 * 
 */
public final class StatusConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final StatusConditionArgs Empty = new StatusConditionArgs();

    /**
     * Canonical code of the condition.
     * 
     */
    @Import(name="canonicalCode")
    private @Nullable Output<StatusConditionCanonicalCode> canonicalCode;

    /**
     * @return Canonical code of the condition.
     * 
     */
    public Optional<Output<StatusConditionCanonicalCode>> canonicalCode() {
        return Optional.ofNullable(this.canonicalCode);
    }

    /**
     * Machine-friendly representation of the condition Deprecated. Use canonical_code instead.
     * 
     * @deprecated
     * Machine-friendly representation of the condition Deprecated. Use canonical_code instead.
     * 
     */
    @Deprecated /* Machine-friendly representation of the condition Deprecated. Use canonical_code instead. */
    @Import(name="code")
    private @Nullable Output<StatusConditionCode> code;

    /**
     * @return Machine-friendly representation of the condition Deprecated. Use canonical_code instead.
     * 
     * @deprecated
     * Machine-friendly representation of the condition Deprecated. Use canonical_code instead.
     * 
     */
    @Deprecated /* Machine-friendly representation of the condition Deprecated. Use canonical_code instead. */
    public Optional<Output<StatusConditionCode>> code() {
        return Optional.ofNullable(this.code);
    }

    /**
     * Human-friendly representation of the condition
     * 
     */
    @Import(name="message")
    private @Nullable Output<String> message;

    /**
     * @return Human-friendly representation of the condition
     * 
     */
    public Optional<Output<String>> message() {
        return Optional.ofNullable(this.message);
    }

    private StatusConditionArgs() {}

    private StatusConditionArgs(StatusConditionArgs $) {
        this.canonicalCode = $.canonicalCode;
        this.code = $.code;
        this.message = $.message;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StatusConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StatusConditionArgs $;

        public Builder() {
            $ = new StatusConditionArgs();
        }

        public Builder(StatusConditionArgs defaults) {
            $ = new StatusConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param canonicalCode Canonical code of the condition.
         * 
         * @return builder
         * 
         */
        public Builder canonicalCode(@Nullable Output<StatusConditionCanonicalCode> canonicalCode) {
            $.canonicalCode = canonicalCode;
            return this;
        }

        /**
         * @param canonicalCode Canonical code of the condition.
         * 
         * @return builder
         * 
         */
        public Builder canonicalCode(StatusConditionCanonicalCode canonicalCode) {
            return canonicalCode(Output.of(canonicalCode));
        }

        /**
         * @param code Machine-friendly representation of the condition Deprecated. Use canonical_code instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Machine-friendly representation of the condition Deprecated. Use canonical_code instead.
         * 
         */
        @Deprecated /* Machine-friendly representation of the condition Deprecated. Use canonical_code instead. */
        public Builder code(@Nullable Output<StatusConditionCode> code) {
            $.code = code;
            return this;
        }

        /**
         * @param code Machine-friendly representation of the condition Deprecated. Use canonical_code instead.
         * 
         * @return builder
         * 
         * @deprecated
         * Machine-friendly representation of the condition Deprecated. Use canonical_code instead.
         * 
         */
        @Deprecated /* Machine-friendly representation of the condition Deprecated. Use canonical_code instead. */
        public Builder code(StatusConditionCode code) {
            return code(Output.of(code));
        }

        /**
         * @param message Human-friendly representation of the condition
         * 
         * @return builder
         * 
         */
        public Builder message(@Nullable Output<String> message) {
            $.message = message;
            return this;
        }

        /**
         * @param message Human-friendly representation of the condition
         * 
         * @return builder
         * 
         */
        public Builder message(String message) {
            return message(Output.of(message));
        }

        public StatusConditionArgs build() {
            return $;
        }
    }

}
