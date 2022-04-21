// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.portal.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The dashboard&#39;s part position.
 * 
 */
public final class DashboardPartsResponsePosition extends com.pulumi.resources.InvokeArgs {

    public static final DashboardPartsResponsePosition Empty = new DashboardPartsResponsePosition();

    /**
     * The dashboard&#39;s part column span.
     * 
     */
    @Import(name="colSpan", required=true)
    private Integer colSpan;

    public Integer colSpan() {
        return this.colSpan;
    }

    /**
     * The dashboard part&#39;s metadata.
     * 
     */
    @Import(name="metadata")
    private @Nullable Map<String,Object> metadata;

    public Optional<Map<String,Object>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * The dashboard&#39;s part row span.
     * 
     */
    @Import(name="rowSpan", required=true)
    private Integer rowSpan;

    public Integer rowSpan() {
        return this.rowSpan;
    }

    /**
     * The dashboard&#39;s part x coordinate.
     * 
     */
    @Import(name="x", required=true)
    private Integer x;

    public Integer x() {
        return this.x;
    }

    /**
     * The dashboard&#39;s part y coordinate.
     * 
     */
    @Import(name="y", required=true)
    private Integer y;

    public Integer y() {
        return this.y;
    }

    private DashboardPartsResponsePosition() {}

    private DashboardPartsResponsePosition(DashboardPartsResponsePosition $) {
        this.colSpan = $.colSpan;
        this.metadata = $.metadata;
        this.rowSpan = $.rowSpan;
        this.x = $.x;
        this.y = $.y;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardPartsResponsePosition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardPartsResponsePosition $;

        public Builder() {
            $ = new DashboardPartsResponsePosition();
        }

        public Builder(DashboardPartsResponsePosition defaults) {
            $ = new DashboardPartsResponsePosition(Objects.requireNonNull(defaults));
        }

        public Builder colSpan(Integer colSpan) {
            $.colSpan = colSpan;
            return this;
        }

        public Builder metadata(@Nullable Map<String,Object> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder rowSpan(Integer rowSpan) {
            $.rowSpan = rowSpan;
            return this;
        }

        public Builder x(Integer x) {
            $.x = x;
            return this;
        }

        public Builder y(Integer y) {
            $.y = y;
            return this;
        }

        public DashboardPartsResponsePosition build() {
            $.colSpan = Objects.requireNonNull($.colSpan, "expected parameter 'colSpan' to be non-null");
            $.rowSpan = Objects.requireNonNull($.rowSpan, "expected parameter 'rowSpan' to be non-null");
            $.x = Objects.requireNonNull($.x, "expected parameter 'x' to be non-null");
            $.y = Objects.requireNonNull($.y, "expected parameter 'y' to be non-null");
            return $;
        }
    }

}
