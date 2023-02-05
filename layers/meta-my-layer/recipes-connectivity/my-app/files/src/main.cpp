#include <crow.h>
#include <sw/redis++/redis++.h>

int main()
{
    auto redis = sw::redis::Redis("tcp://localhost:6379");
    crow::SimpleApp app;
    CROW_ROUTE(app, "/")([](){
        return "my-hello-world";
    });
    redis.set("my-key", "my-value");
    app.port(18080).multithreaded().run();
}
