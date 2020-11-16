FROM node:12.18.1

ENV NODE_ENV=production

WORKDIR /app

COPY ["package.json", "package-lock.json*", "./"]

RUN npm install --production

COPY . .

#RUN npm run build


#WORKDIR .

CMD [ "npm", "start" ]

#ENTRYPOINT [ "serve -s build"]

