// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLogGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLogGroupArgs Empty = new GetLogGroupArgs();

    /**
     * The name of the Cloudwatch log group
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * A map of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetLogGroupArgs() {}

    private GetLogGroupArgs(GetLogGroupArgs $) {
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLogGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLogGroupArgs $;

        public Builder() {
            $ = new GetLogGroupArgs();
        }

        public Builder(GetLogGroupArgs defaults) {
            $ = new GetLogGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetLogGroupArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
