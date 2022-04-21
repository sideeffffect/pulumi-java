// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Qos Traffic Profiler Port range properties.
 * 
 */
public final class QosPortRangeResponse extends com.pulumi.resources.InvokeArgs {

    public static final QosPortRangeResponse Empty = new QosPortRangeResponse();

    /**
     * Qos Port Range end.
     * 
     */
    @Import(name="end")
    private @Nullable Integer end;

    public Optional<Integer> end() {
        return Optional.ofNullable(this.end);
    }

    /**
     * Qos Port Range start.
     * 
     */
    @Import(name="start")
    private @Nullable Integer start;

    public Optional<Integer> start() {
        return Optional.ofNullable(this.start);
    }

    private QosPortRangeResponse() {}

    private QosPortRangeResponse(QosPortRangeResponse $) {
        this.end = $.end;
        this.start = $.start;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QosPortRangeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QosPortRangeResponse $;

        public Builder() {
            $ = new QosPortRangeResponse();
        }

        public Builder(QosPortRangeResponse defaults) {
            $ = new QosPortRangeResponse(Objects.requireNonNull(defaults));
        }

        public Builder end(@Nullable Integer end) {
            $.end = end;
            return this;
        }

        public Builder start(@Nullable Integer start) {
            $.start = start;
            return this;
        }

        public QosPortRangeResponse build() {
            return $;
        }
    }

}
