// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.securityinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * ies for the solution content item
 * 
 */
public final class MetadataCategoriesResponse extends com.pulumi.resources.InvokeArgs {

    public static final MetadataCategoriesResponse Empty = new MetadataCategoriesResponse();

    /**
     * domain for the solution content item
     * 
     */
    @Import(name="domains")
    private @Nullable List<String> domains;

    public Optional<List<String>> domains() {
        return Optional.ofNullable(this.domains);
    }

    /**
     * Industry verticals for the solution content item
     * 
     */
    @Import(name="verticals")
    private @Nullable List<String> verticals;

    public Optional<List<String>> verticals() {
        return Optional.ofNullable(this.verticals);
    }

    private MetadataCategoriesResponse() {}

    private MetadataCategoriesResponse(MetadataCategoriesResponse $) {
        this.domains = $.domains;
        this.verticals = $.verticals;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MetadataCategoriesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MetadataCategoriesResponse $;

        public Builder() {
            $ = new MetadataCategoriesResponse();
        }

        public Builder(MetadataCategoriesResponse defaults) {
            $ = new MetadataCategoriesResponse(Objects.requireNonNull(defaults));
        }

        public Builder domains(@Nullable List<String> domains) {
            $.domains = domains;
            return this;
        }

        public Builder domains(String... domains) {
            return domains(List.of(domains));
        }

        public Builder verticals(@Nullable List<String> verticals) {
            $.verticals = verticals;
            return this;
        }

        public Builder verticals(String... verticals) {
            return verticals(List.of(verticals));
        }

        public MetadataCategoriesResponse build() {
            return $;
        }
    }

}
