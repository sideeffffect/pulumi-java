// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class RouteSpecHttpRouteMatchHeaderMatchRange {
    /**
     * The end of the range.
     * 
     */
    private final Integer end;
    /**
     * The start of the range.
     * 
     */
    private final Integer start;

    @CustomType.Constructor
    private RouteSpecHttpRouteMatchHeaderMatchRange(
        @CustomType.Parameter("end") Integer end,
        @CustomType.Parameter("start") Integer start) {
        this.end = end;
        this.start = start;
    }

    /**
     * The end of the range.
     * 
    */
    public Integer end() {
        return this.end;
    }
    /**
     * The start of the range.
     * 
    */
    public Integer start() {
        return this.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttpRouteMatchHeaderMatchRange defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer end;
        private Integer start;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttpRouteMatchHeaderMatchRange defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.end = defaults.end;
    	      this.start = defaults.start;
        }

        public Builder end(Integer end) {
            this.end = Objects.requireNonNull(end);
            return this;
        }
        public Builder start(Integer start) {
            this.start = Objects.requireNonNull(start);
            return this;
        }        public RouteSpecHttpRouteMatchHeaderMatchRange build() {
            return new RouteSpecHttpRouteMatchHeaderMatchRange(end, start);
        }
    }
}
