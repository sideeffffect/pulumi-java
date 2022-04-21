// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cache.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Linked server Id
 * 
 */
public final class RedisLinkedServerResponse extends com.pulumi.resources.InvokeArgs {

    public static final RedisLinkedServerResponse Empty = new RedisLinkedServerResponse();

    /**
     * Linked server Id.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    public String id() {
        return this.id;
    }

    private RedisLinkedServerResponse() {}

    private RedisLinkedServerResponse(RedisLinkedServerResponse $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RedisLinkedServerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RedisLinkedServerResponse $;

        public Builder() {
            $ = new RedisLinkedServerResponse();
        }

        public Builder(RedisLinkedServerResponse defaults) {
            $ = new RedisLinkedServerResponse(Objects.requireNonNull(defaults));
        }

        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public RedisLinkedServerResponse build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
